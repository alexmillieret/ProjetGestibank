package com.wha.service;

import java.util.List; 

import com.wha.model.Administrateur;

public interface AdministrateurService {
	public void addAdministrateur(Administrateur administrateur);

	public List<Administrateur> getAllAdministrateurs();

	public void deleteAdministrateur(Integer administrateurId);

	public Administrateur getAdministrateur(int administrateurId);

	public Administrateur updateAdministrateur(Administrateur administrateur);
}
