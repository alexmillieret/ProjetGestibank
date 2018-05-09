package com.wha.service;

import java.util.List; 

import com.wha.model.Adresse;

public interface AdresseService {
	public void addAdresse(Adresse adresse);

	public List<Adresse> getAllAdresses();

	public void deleteAdresse(Integer adresseId);

	public Adresse getAdresse(int adresseId);

	public Adresse updateAdresse(Adresse adresse);
}
