package com.wha.dao;

import java.util.List;

import com.wha.model.Demande;

public interface DemandeDAO {

	
	public void addDemande(Demande demande);
	
	public List<Demande> getAllDemande();
	
	public void deleteDemande (Integer idDemande);
	
	
	
	
}
