package com.wha.service;

import java.util.List; 

import com.wha.model.Client;

public interface ClientService {
	public void addClient(Client client);

	public List<Client> getAllClients();

	public void deleteClient(Integer idUtilisateur);

	public Client getClient(int idUtilisateur);

	public Client updateClient(Client client);
}
