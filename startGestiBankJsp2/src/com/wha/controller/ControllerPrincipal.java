package com.wha.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wha.model.Administrateur;
import com.wha.model.Adresse;
import com.wha.model.Agent;
import com.wha.model.Client;
import com.wha.model.Compte;
import com.wha.model.Demande;
import com.wha.model.Employee;
import com.wha.model.Utilisateur;
import com.wha.service.EmployeeService;
import com.wha.service.UtilisateurService;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import com.wha.service.AdministrateurService;
import com.wha.service.AdresseService;
import com.wha.service.AgentService;
import com.wha.service.ClientService;
import com.wha.service.CompteService;
import com.wha.service.DemandeService;

@Controller
public class ControllerPrincipal {
	private static final Logger logger = Logger.getLogger(ControllerPrincipal.class);

	public ControllerPrincipal() {
		System.out.println("ControllerPrincipal()");
	}

	@Autowired
	private ClientService clientService;
	@Autowired
	private UtilisateurService utilisateurService;
	@Autowired
	private AdministrateurService administrateurService;
	@Autowired
	private AgentService agentService;
	@Autowired
	private DemandeService demandeService;
	@Autowired
	private CompteService compteService;

	@RequestMapping(value = "/")
	public ModelAndView accueil(ModelAndView model) {
		// cr�tion d'un client au d�marrage
		Client client = new Client();
		client.setMail("alex.millieret@free.fr");
		client.setNom("millieret");
		client.setPrenom("alex");
		client.setNomUtilisateur("client");
		client.setMotDePasse("client");
		Adresse adresseClient = new Adresse();
		adresseClient.setVille("Annecy");
		Compte compte = new Compte("012321456", 120.00, new Date());
		client.getCompte().add(compte);
		client.setAdresse(adresseClient);
		clientService.addClient(client);
		compte.setClient(client);
		compteService.addCompte(compte);
		

		// cr�ation d'un admin au d�marrage
		Administrateur admin = new Administrateur();
		admin.setMail("admin@free.fr");
		admin.setNom("admin");
		admin.setNomUtilisateur("admin");
		admin.setMotDePasse("admin");
		admin.setPrenom("admin");
		administrateurService.addAdministrateur(admin);
		// cr�ation d'un agent au d�marrage
		Agent agent = new Agent();
		agent.setMail("agent@free.fr");
		agent.setNom("agent");
		agent.setPrenom("agent");
		agent.setNomUtilisateur("agent");
		agent.setMotDePasse("agent");
		agentService.addAgent(agent);

		model.setViewName("accueil");
		return model;
	}

	@RequestMapping(value = "/newClient", method = RequestMethod.GET)
	public ModelAndView nouveauClient(ModelAndView model) {
		// Adresse adresse = new Adresse();
		// Client client = new Client();
		// client.setAdresse(adresse);
		// model.addObject("client", client);

		Demande dem = new Demande();
		model.addObject("demande", dem);
		model.setViewName("formulaire");
		return model;
	}

	@RequestMapping(value = "/formconnexion", method = RequestMethod.POST)
	public ModelAndView formconnexion(ModelAndView model) throws IOException {
		model.setViewName("connexion");
		return model;
	}

	@RequestMapping(value = "/demandeCreationClient", method = RequestMethod.POST)
	public ModelAndView addDemande(@ModelAttribute Demande demande) throws IOException {
		demande.setDateCreation(new Date());
		demandeService.addDemande(demande);
		return new ModelAndView("espaceAgent");
	}

	@RequestMapping(value = "/redirectionVersEspaceCorrespondant", method = RequestMethod.POST)
	public ModelAndView connect(HttpServletRequest request) {
		String nomUtilisateur = request.getParameter("nomUtilisateur");
		String motDePasse = request.getParameter("motDePasse");
		try {
			Utilisateur utilisateur = utilisateurService.getUser(nomUtilisateur, motDePasse);
			String role = utilisateurService.getRoleUtilisateur(nomUtilisateur, motDePasse);
			if (role.equals("ADMINISTRATEUR")) {
				ModelAndView model = new ModelAndView("espaceAdmin");
				model.addObject("admin", utilisateur);
				return model;
			} else if (role.equals("CLIENT")) {
				Client client= clientService.recupClient(nomUtilisateur, motDePasse);
				ModelAndView model = new ModelAndView("espaceclient");
				model.addObject("client", client);
				return model;
			} else if (role.equals("AGENT")) {
				ModelAndView model = new ModelAndView("espaceAgent");
				model.addObject("agent", utilisateur);
				return model;
			}
		} catch (Exception e) {
		}
		ModelAndView model = new ModelAndView("connexion");
		String message = "Utilisateur ou mot de passe incorrect";
		model.addObject("message", message);
		return model;
	}
	
	 @RequestMapping(value = "/listeCompte", method = RequestMethod.POST)
	 public ModelAndView listeCompte(@ModelAttribute Client client) {
		Set<Compte> listeCompte = client.getCompte();
		ModelAndView model = new ModelAndView("listeComptes");
		model.addObject("listeCompte", listeCompte);
		return model; 
	 }
	/*
	 * @RequestMapping(value = "/") public ModelAndView listEmployee(ModelAndView
	 * model) throws IOException { 
	 * List<Employee> listEmployee = employeeService.getAllEmployees(); model.addObject("listEmployee",
	 * listEmployee); model.setViewName("home"); return model; }
	 * 
	 * @RequestMapping(value = "/newEmployee", method = RequestMethod.GET) public
	 * ModelAndView newContact(ModelAndView model) { Employee employee = new
	 * Employee(); model.addObject("employee", employee);
	 * model.setViewName("EmployeeForm"); return model; }
	 * 
	 * @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST) public
	 * ModelAndView saveEmployee(@ModelAttribute Employee employee) { if
	 * (employee.getId() == 0) { // if employee id is 0 then creating the //
	 * employee other updating the employee employeeService.addEmployee(employee); }
	 * else { employeeService.updateEmployee(employee); } return new
	 * ModelAndView("redirect:/"); }
	 * 
	 * @RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET) public
	 * ModelAndView deleteEmployee(HttpServletRequest request) { int employeeId =
	 * Integer.parseInt(request.getParameter("id"));
	 * employeeService.deleteEmployee(employeeId); return new
	 * ModelAndView("redirect:/"); }
	 * 
	 * @RequestMapping(value = "/editEmployee", method = RequestMethod.GET) public
	 * ModelAndView editContact(HttpServletRequest request) { int employeeId =
	 * Integer.parseInt(request.getParameter("id")); Employee employee =
	 * employeeService.getEmployee(employeeId); ModelAndView model = new
	 * ModelAndView("EmployeeForm"); model.addObject("employee", employee);
	 * 
	 * return model; }
	 */
}
