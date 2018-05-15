package com.wha.service;

import java.util.List;

import com.wha.model.Demande;

public interface DemandeService {
	

	public void addDemande(Demande demande);
	
	public List<Demande> getAllDemande();
	
	public void deleteDemande (Integer idDemande);
	
}
