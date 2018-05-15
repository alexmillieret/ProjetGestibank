package com.wha.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@DiscriminatorValue("CLIENT")
public class Client extends Utilisateur implements Serializable{
	

	@Column
	private int NbEnfant;
	
	@Column
	private String situationMatrimoniale;
	
	
	@OneToMany (mappedBy="client")
	private Set<Compte> comptes;
	//Zone Getters/Setters
	

	public int getNbEnfant() {
		return NbEnfant;
	}

	public Set<Compte> getCompte() {
		return comptes;
	}

	public void setCompte(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	public void setSituationMatrimoniale(String situationMatrimoniale) {
		this.situationMatrimoniale = situationMatrimoniale;
	}

	public void setNbEnfant(int nbEnfant) {
		NbEnfant = nbEnfant;
	}

	public String getSituationMatrimoniale() {
		return situationMatrimoniale;
	}

}
