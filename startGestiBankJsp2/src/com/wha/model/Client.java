package com.wha.model;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@DiscriminatorValue("CLI")
public class Client extends Utilisateur {
	
	private static final long serialVersionUID = -3465813074586302847L;
	//Zone Attributs
	
	@Column
	private int NbEnfant;
	
	@Column
	private String situationMF;
	
	

	public Client() {
		// TODO Auto-generated constructor stub
		super();
	}

	
	//Zone Getters/Setters
	
	public int getNbEnfant() {
		return NbEnfant;
	}

	public void setNbEnfant(int nbEnfant) {
		NbEnfant = nbEnfant;
	}

	public String getSituationMF() {
		return situationMF;
	}

	public void setSituationMF(String situationMF) {
		this.situationMF = situationMF;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
