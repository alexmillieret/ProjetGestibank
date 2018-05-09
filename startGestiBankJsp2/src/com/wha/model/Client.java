package com.wha.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@DiscriminatorValue("CLIENT")
public class Client extends Utilisateur{
	

	@Column
	private int NbEnfant;
	
	@Column
	private String situationMatrimoniale;
	
public Client() {
	super();
}
	
	//Zone Getters/Setters
	

	public int getNbEnfant() {
		return NbEnfant;
	}

	public void setNbEnfant(int nbEnfant) {
		NbEnfant = nbEnfant;
	}

	public String getSituationMatrimoniale() {
		return situationMatrimoniale;
	}

	public void setSituationMF(String situationMatrimoniale) {
		this.situationMatrimoniale = situationMatrimoniale;
	}

}
