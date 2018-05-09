package com.wha.dao;

import java.util.List;  
import com.wha.model.Adresse;

public interface AdresseDAO {

	public void addAdresse(Adresse adresse);

	public List<Adresse> getAllAdresses();

	public void deleteAdresse(Integer adresseId);

	public Adresse updateAdresse(Adresse adresse);

	public Adresse getAdresse(int adressetId);
}
