package com.wha.service;


import java.util.List; 

import com.wha.model.Agent;

public interface AgentService {
	public void addAgent(Agent agent);
	
	public  List<Agent> getAllAgent();
	
	public void deleteAgent(Integer idAgent);
	
	public Agent getAgent(int Agentid);
	
	public Agent updateAgent (Agent agent);

}
