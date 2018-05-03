package com.wha.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TypeUser")
@DiscriminatorValue("USER")
public class Utilisateur implements Serializable {
	
	private static final long serialVersionUID = -3465813074586302847L;
	// zone  d'Atributs
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUtilisateur;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private String mail;
	
	@Column
	private String adresse;
	
	@Column
	private int tel;
	
	// Getter/Setter
	
	public String getNom() {
		return nom;
	}
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) { 
		this.adresse = adresse;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}
