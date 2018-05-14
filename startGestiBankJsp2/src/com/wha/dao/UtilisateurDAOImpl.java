package com.wha.dao;

import java.util.List; 

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.wha.model.Utilisateur;

@Repository
public class UtilisateurDAOImpl implements UtilisateurDAO {

	public UtilisateurDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	 public void addUtilisateur(Utilisateur utilisateur) {
	        sessionFactory.getCurrentSession().saveOrUpdate(utilisateur);
	 
	    }
	 
	    @SuppressWarnings("unchecked")
	    public List<Utilisateur> getAllUtilisateur() {
	 
	        return sessionFactory.getCurrentSession().createQuery("from Utilisateur")
	                .list();
	    }
	    public String getRoleUtilisateur(String nomUtilisateur, String motDePasse) {
	   	 
	        return (String) sessionFactory.getCurrentSession().createQuery("select user.class from Utilisateur as user where nomUtilisateur='"+nomUtilisateur+"' and motDePasse='"+motDePasse+"'").uniqueResult();
	    }

	 
	    @Override
	    public void deleteUtilisateur(Integer idUtilisateur) {
	        Utilisateur utilisateur = (Utilisateur) sessionFactory.getCurrentSession().load(
	                Utilisateur.class, idUtilisateur);
	        if (null != utilisateur) {
	            this.sessionFactory.getCurrentSession().delete(utilisateur);
	        }
	 
	    }
	 
	    public Utilisateur getUtilisateur(int utilisateurid) {
	        return (Utilisateur) sessionFactory.getCurrentSession().get(
	                Utilisateur.class, utilisateurid);
	    }
	 
	    
	    @Override
	    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
	        sessionFactory.getCurrentSession().update(utilisateur);
	        return utilisateur;
	    }


		

}
