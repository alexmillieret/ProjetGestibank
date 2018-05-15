package com.wha.service;

import java.util.List; 

import com.wha.model.Compte;

public interface CompteService {
	public void addCompte(Compte compte);

	public List<Compte> getAllComptes();

	public void deleteCompte(Integer compteId);

	public Compte getCompte(int compteid);

	public Compte updateCompte(Compte compte);
}
