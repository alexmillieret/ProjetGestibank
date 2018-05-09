package com.wha.model;

import java.util.Date; 
 


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("ADMINISTRATEUR")
public class Administrateur extends Utilisateur {

	
	public Administrateur() {
		super();
	}

	

}
