package com.wha.dao;

import java.util.List; 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wha.model.Compte;
@Repository
public class CompteDAOImpl implements CompteDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addCompte(Compte compte) {
        sessionFactory.getCurrentSession().saveOrUpdate(compte);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Compte> getAllComptes() {
 
        return sessionFactory.getCurrentSession().createQuery("from Compte")
                .list();
    }
 
    @Override
    public void deleteCompte(Integer compteId) {
        Compte compte = (Compte) sessionFactory.getCurrentSession().load(
                Compte.class, compteId);
        if (null != compte) {
            this.sessionFactory.getCurrentSession().delete(compte);
        }
 
    }
 
    public Compte getCompte(int empid) {
        return (Compte) sessionFactory.getCurrentSession().get(
                Compte.class, empid);
    }
 
    @Override
    public Compte updateCompte(Compte compte) {
        sessionFactory.getCurrentSession().update(compte);
        return compte;
    }
}
