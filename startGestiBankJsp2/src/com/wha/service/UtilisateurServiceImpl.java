package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.UtilisateurDAO;
import com.wha.model.Utilisateur;


@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurDAO utilisateurDAO;
	
	
	@Override
	@Transactional
	public void addUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		utilisateurDAO.addUtilisateur(utilisateur);

	}

	@Override
	@Transactional
	public List<Utilisateur> getAllUtilisateur() {
		return utilisateurDAO.getAllUtilisateur();
	}

	@Override
	@Transactional
	public void deleteUtilisateur(Integer idUtilisateur) {
		utilisateurDAO.deleteUtilisateur(idUtilisateur);

	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		return utilisateurDAO.updateUtilisateur(utilisateur);
	}

	@Override
	public Utilisateur getUtilisateur(int Utilisateurid) {
		return null;
	}
	
	public void setUtilisateurDAO(UtilisateurDAO utilisateurDAO){
		this.utilisateurDAO = utilisateurDAO;
	}
	public String getRoleUtilisateur(String nomUtilisateur, String motDePasse) {
		return utilisateurDAO.getRoleUtilisateur(nomUtilisateur, motDePasse);
	}

}
