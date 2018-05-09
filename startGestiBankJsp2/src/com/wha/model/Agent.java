package com.wha.model;

import java.util.Date; 
 


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("AGENT")
public class Agent extends Utilisateur {

	
	@Column
	 private Date dateDebutContrat;
	
	@Column
	private int matricule;
	
	public Agent() {
		super();
	}
	public Date getDateDebutContrat() {
		return dateDebutContrat;
	}
	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	

}
