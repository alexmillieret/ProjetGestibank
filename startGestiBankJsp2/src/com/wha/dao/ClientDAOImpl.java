package com.wha.dao;

import java.util.List; 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wha.model.Client;
import com.wha.model.Utilisateur;
@Repository
public class ClientDAOImpl implements ClientDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addClient(Client client) {
        sessionFactory.getCurrentSession().saveOrUpdate(client);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Client> getAllClients() {
 
        return sessionFactory.getCurrentSession().createQuery("from Utilisateur where role='client'")
                .list();
    }
 
    @Override
    public void deleteClient(Integer clientId) {
        Client client = (Client) sessionFactory.getCurrentSession().load(
                Client.class, clientId);
        if (null != client) {
            this.sessionFactory.getCurrentSession().delete(client);
        }
 
    }
    @Override
    public Client recupClient(String nomUtilisateur, String motDePasse) {
        return (Client) sessionFactory.getCurrentSession().createQuery("from Client as client where nomUtilisateur='"+nomUtilisateur+"' and motDePasse='"+motDePasse+"'").uniqueResult();
    }
 
    public Client getClient(int clientId) {
        return (Client) sessionFactory.getCurrentSession().get(
                Client.class, clientId);
    }
 
    @Override
    public Client updateClient(Client client) {
        sessionFactory.getCurrentSession().update(client);
        return client;
    }
}
