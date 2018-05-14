package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.ClientDAO;
import com.wha.model.Client;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
    private ClientDAO clientDAO;
 
    @Override
    @Transactional
    public void addClient(Client client) {
        clientDAO.addClient(client);
    }
 
    @Override
    @Transactional
    public List<Client> getAllClients() {
        return clientDAO.getAllClients();
    }
 
    @Override
    @Transactional
    public void deleteClient(Integer idUtilisateur) {
        clientDAO.deleteClient(idUtilisateur);
    }
 
    public Client getClient(int idUtilisateur) {
        return clientDAO.getClient(idUtilisateur);
    }
 
    public Client updateClient(Client client) {
        // TODO Auto-generated method stub
        return clientDAO.updateClient(client);
    }
 
    public void setClientDAO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

}
