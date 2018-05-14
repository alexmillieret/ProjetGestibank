package com.wha.controller;

import java.io.IOException;
import java.util.List;

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
import com.wha.model.Employee;
import com.wha.model.Utilisateur;
import com.wha.service.EmployeeService;
import com.wha.service.UtilisateurService;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import com.wha.service.AdministrateurService;
import com.wha.service.AdresseService;
import com.wha.service.AgentService;
import com.wha.service.ClientService;

@Controller
public class ControllerPrincipal {
	private static final Logger logger = Logger.getLogger(ControllerPrincipal.class);

	public ControllerPrincipal() {
		System.out.println("ControllerPrincipal()");
	}

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private AdresseService adresseService;
	@Autowired
	private UtilisateurService utilisateurService;
	@Autowired
	private AdministrateurService administrateurService;
	@Autowired
	private AgentService agentService;

	@RequestMapping(value = "/")
	public ModelAndView accueil(ModelAndView model) {
		// crétion d'un client au démarrage
		Client client = new Client();
		client.setMail("alex.millieret@free.fr");
		client.setNom("millieret");
		client.setPrenom("alex");
		client.setNomUtilisateur("client");
		client.setMotDePasse("client");
		Adresse adresseClient = new Adresse();
		adresseClient.setVille("Annecy");
		client.setAdresse(adresseClient);
		clientService.addClient(client);
		// création d'un admin au démarrage
		Administrateur admin = new Administrateur();
		admin.setMail("admin@free.fr");
		admin.setNom("admin");
		admin.setNomUtilisateur("admin");
		admin.setMotDePasse("admin");
		admin.setPrenom("admin");
		administrateurService.addAdministrateur(admin);
		// création d'un agent au démarrage
		Agent agent = new Agent();
		agent.setMail("agent@free.fr");
		agent.setNom("agent");
		agent.setPrenom("agent");
		agentService.addAgent(agent);

		model.setViewName("accueil");
		return model;
	}

	@RequestMapping(value = "/newClient", method = RequestMethod.GET)
	public ModelAndView nouveauClient(ModelAndView model) {
		Adresse adresse = new Adresse();
		Client client = new Client();
		client.setAdresse(adresse);
		model.addObject("client", client);
		model.setViewName("formulaire");
		return model;
	}

	@RequestMapping(value = "/formconnexion", method = RequestMethod.POST)
	public ModelAndView formconnexion(ModelAndView model) throws IOException {
		model.setViewName("connexion");
		return model;
	}

	@RequestMapping(value = "/redirectionVersEspaceCorrespondant", method = RequestMethod.POST)
	public ModelAndView connect(HttpServletRequest request) {
		String nomUtilisateur = request.getParameter("nomUtilisateur");
		String motDePasse = request.getParameter("motDePasse");
		try {
		Utilisateur utilisateur = utilisateurService.getUser(nomUtilisateur, motDePasse);
		String role = utilisateurService.getRoleUtilisateur(nomUtilisateur, motDePasse);
		if(role.equals("ADMINISTRATEUR")) {
		ModelAndView model = new ModelAndView("espaceAdmin");
		model.addObject("admin", utilisateur);
		return model;
		} else if(role.equals("CLIENT")){
			ModelAndView model = new ModelAndView("espaceclient");
			model.addObject("client", utilisateur);
			return model;
		}else if(role.equals("AGENT")){
			ModelAndView model = new ModelAndView("espaceAgent");
			model.addObject("agent", utilisateur);
			return model;
	}
		}catch (Exception e){
	}
		ModelAndView model = new ModelAndView("connexion");
		String message = "Utilisateur ou mote de passe incorrect";
		model.addObject("message", message);
		return model;
	}
	/*@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("EmployeeForm");
		return model;
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		if (employee.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			employeeService.addEmployee(employee);
		} else {
			employeeService.updateEmployee(employee);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(employeeId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		Employee employee = employeeService.getEmployee(employeeId);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("employee", employee);

		return model;
	}
*/
}
