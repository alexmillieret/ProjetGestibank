package com.wha.dao;

import java.util.List; 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wha.model.Administrateur;
@Repository
public class AdministrateurDAOImpl implements AdministrateurDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addAdministrateur(Administrateur administrateur) {
        sessionFactory.getCurrentSession().saveOrUpdate(administrateur);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Administrateur> getAllAdministrateurs() {
 
        return sessionFactory.getCurrentSession().createQuery("from Administrateur")
                .list();
    }
 
    @Override
    public void deleteAdministrateur(Integer administrateurId) {
        Administrateur administrateur = (Administrateur) sessionFactory.getCurrentSession().load(
                Administrateur.class, administrateurId);
        if (null != administrateur) {
            this.sessionFactory.getCurrentSession().delete(administrateur);
        }
 
    }
 
    public Administrateur getAdministrateur(int administrateurId) {
        return (Administrateur) sessionFactory.getCurrentSession().get(
                Administrateur.class, administrateurId);
    }
 
    @Override
    public Administrateur updateAdministrateur(Administrateur administrateur) {
        sessionFactory.getCurrentSession().update(administrateur);
        return administrateur;
    }
}
