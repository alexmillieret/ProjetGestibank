package com.wha.model;

import java.util.Date;

public class DemandeVirement extends Demande {

	public DemandeVirement() {
	}

	public DemandeVirement(int idDemande, Date dateCreation, Date dateReponse) {
		super(idDemande, dateCreation, dateReponse);
	}

}
