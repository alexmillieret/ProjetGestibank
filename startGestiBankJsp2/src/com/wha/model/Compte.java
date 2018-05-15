package com.wha.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("COMPTE")
@DiscriminatorColumn(name="TYPE")

public class Compte implements Serializable {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String rib;
	
	private double solde;
	
	private Date dateCreation;
	
	private List<Mouvement> listeMouvements;

	// Constructeur

	public Compte() {
	}

	public Compte(String rib, double solde, Date dateCreation, List<Mouvement> listeMouvements) {
		super();
		this.rib = rib;
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.listeMouvements = listeMouvements;
	}
	// GET SET

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public List<Mouvement> getListeMouvements() {
		return listeMouvements;
	}

	public void setListeMouvements(List<Mouvement> listeMouvements) {
		this.listeMouvements = listeMouvements;
	}

}
