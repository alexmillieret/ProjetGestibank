package com.wha.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEMANDES")
public class Demande implements Serializable {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDemande;

	private String nom;

	private Date dateCreation;

	private Date dateReponse;

	// constructeur
	public Demande() {
	}

	public Demande(int idDemande, Date dateCreation, Date dateReponse) {
		super();
		this.idDemande = idDemande;
		this.dateCreation = dateCreation;
		this.dateReponse = dateReponse;
	}

	// Get Set
	public int getIdDemande() {
		return idDemande;
	}

	public void setIdDemande(int idDemande) {
		this.idDemande = idDemande;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateReponse() {
		return dateReponse;
	}

	public void setDateReponse(Date dateReponse) {
		this.dateReponse = dateReponse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
