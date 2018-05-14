package com.wha.service;


import java.util.List; 

import com.wha.model.Utilisateur;

public interface UtilisateurService {
	public void addUtilisateur(Utilisateur utilisateur);
	
	public  List<Utilisateur> getAllUtilisateur();
	
	public void deleteUtilisateur(Integer idUtilisateur);
	
	public Utilisateur getUtilisateur(int idUtilisateur);
	
	public Utilisateur updateUtilisateur (Utilisateur utilisateur);
	
	public String getRoleUtilisateur(String nomUtilisateur, String motDePasse);
	public Utilisateur getUser(String nomUtilisateur, String motDePasse);

}
