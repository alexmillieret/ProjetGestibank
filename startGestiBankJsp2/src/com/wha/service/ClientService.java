package com.wha.service;

import java.util.List; 

import com.wha.model.Client;

public interface ClientService {
	public void addClient(Client client);

	public List<Client> getAllClients();

	public void deleteClient(Integer clientId);

	public Client getClient(int clientId);

	public Client updateClient(Client client);
}
