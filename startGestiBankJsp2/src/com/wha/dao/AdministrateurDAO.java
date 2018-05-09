package com.wha.dao;

import java.util.List;  
import com.wha.model.Administrateur;

public interface AdministrateurDAO {

	public void addAdministrateur(Administrateur administrateur);

	public List<Administrateur> getAllAdministrateurs();

	public void deleteAdministrateur(Integer administrateurId);

	public Administrateur updateAdministrateur(Administrateur administrateur);

	public Administrateur getAdministrateur(int administrateurtId);
}
