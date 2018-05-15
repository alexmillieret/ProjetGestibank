package com.wha.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.dao.DemandeDAO;
import com.wha.model.Demande;

@Service
@Transactional
public class DemandeServiceImpl implements DemandeService {

	@Autowired
	private DemandeDAO demandeDAO;
	
	@Override
	@Transactional
	public void addDemande(Demande demande) {
		demandeDAO.addDemande(demande);
	}

	@Override
	public List<Demande> getAllDemande() {
		return demandeDAO.getAllDemande();
	}

	@Override
	@Transactional
	public void deleteDemande(Integer idDemande) {
		demandeDAO.deleteDemande(idDemande);
	}
	
	
}
