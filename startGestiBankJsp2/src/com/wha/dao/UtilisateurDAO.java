package com.wha.dao;

import java.util.List;
import com.wha.model.Utilisateur;

public interface UtilisateurDAO {
	
	public void addUtilisateur(Utilisateur utilisateur);

	public List<Utilisateur> getAllUtilisateur();

	public void deleteUtilisateur(Integer idUtilisateur);

	public Utilisateur updateUtilisateur(Utilisateur utilisateur);
	
	public Utilisateur getUtilisateur(int idUtilisateur);
	public Utilisateur getUser(String nomUtilisateur, String motDePasse);
	
	public String getRoleUtilisateur(String nomUtilisateur, String motDePasse);
}
