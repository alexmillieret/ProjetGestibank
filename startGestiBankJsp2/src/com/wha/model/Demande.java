package com.wha.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class Demande implements Serializable {

	//Attributs
	@Id
	private int id;
	@Column
	private Date dateCreation;
	@Column
	private Date dateReponse;

	//constructeur
	public Demande() {
	}

	
	//Get Set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
