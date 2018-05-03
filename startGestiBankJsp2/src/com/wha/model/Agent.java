package com.wha.model;

import java.util.Date; 
 


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("AG")
public class Agent extends Utilisateur {

	private static final long serialVersionUID = -3465813074586302847L;
	
	//Zone Attributs
	
	@Column
	 private Date date_deb;
	
	public Agent() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Date getDate_deb() {
		return date_deb;
	}

	public void setDate_deb(Date date_deb) {
		this.date_deb = date_deb;
	}
	
	
	//Zone Getters/Setters
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
