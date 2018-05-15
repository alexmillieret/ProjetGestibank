package com.wha.dao;

import java.util.List;  
import com.wha.model.Compte;

public interface CompteDAO {

	public void addCompte(Compte compte);

	public List<Compte> getAllComptes();

	public void deleteCompte(Integer compteId);

	public Compte updateCompte(Compte compte);

	public Compte getCompte(int compteid);
}
