package com.wha.dao;

import java.util.List;
import com.wha.model.Agent;

public interface AgentDAO {
	
	public void addAgent(Agent agent);

	public List<Agent> getAllAgent();

	public void deleteAgent(Integer idAgent);

	public Agent updateAgent(Agent agent);
	
	public Agent getAgent(int idAgent);
	
}
