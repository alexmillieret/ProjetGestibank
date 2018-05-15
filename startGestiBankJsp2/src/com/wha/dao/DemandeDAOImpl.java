package com.wha.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wha.model.Demande;

@Repository
public class DemandeDAOImpl implements DemandeDAO {

	public DemandeDAOImpl() {
	}

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addDemande(Demande demande) {
		sessionFactory.getCurrentSession().saveOrUpdate(demande);
	}
	
	public List<Demande> getAllDemande(){
		
		return sessionFactory.getCurrentSession().createQuery("from demande").list();
		
	}
	@Override
	public void deleteDemande (Integer idDemande) {
		Demande demande = (Demande) sessionFactory.getCurrentSession().load(Demande.class, idDemande);
		if (null != demande) {
			this.sessionFactory.getCurrentSession().delete(demande);
		}
	}
	
	public Demande getDemande(int idDemande) {
		return (Demande) sessionFactory.getCurrentSession().get(Demande.class, idDemande);
	}
		
}
