package com.wha.dao;

import java.util.List;  
import com.wha.model.Client;

public interface ClientDAO {

	public void addClient(Client client);

	public List<Client> getAllClients();

	public void deleteClient(Integer clientId);

	public Client updateClient(Client client);

	public Client getClient(int clientId);
}
