package com.wha.dao;

import java.util.List; 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wha.model.Adresse;
@Repository
public class AdresseDAOImpl implements AdresseDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addAdresse(Adresse adresse) {
        sessionFactory.getCurrentSession().saveOrUpdate(adresse);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Adresse> getAllAdresses() {
 
        return sessionFactory.getCurrentSession().createQuery("from Adresse")
                .list();
    }
 
    @Override
    public void deleteAdresse(Integer adresseId) {
        Adresse adresse = (Adresse) sessionFactory.getCurrentSession().load(
                Adresse.class, adresseId);
        if (null != adresse) {
            this.sessionFactory.getCurrentSession().delete(adresse);
        }
 
    }
 
    public Adresse getAdresse(int adresseId) {
        return (Adresse) sessionFactory.getCurrentSession().get(
                Adresse.class, adresseId);
    }
 
    @Override
    public Adresse updateAdresse(Adresse adresse) {
        sessionFactory.getCurrentSession().update(adresse);
        return adresse;
    }
}
