package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.AgentDAO;
import com.wha.model.Agent;


@Service
@Transactional
public class AgentServiceImpl implements AgentDAO {

	@Autowired
	private AgentDAO agentDAO;
	
	
	@Override
	@Transactional
	public void addAgent(Agent agent) {
		// TODO Auto-generated method stub
		agentDAO.addAgent(agent);

	}

	@Override
	@Transactional
	public List<Agent> getAllAgent() {
		return agentDAO.getAllAgent();
	}

	@Override
	@Transactional
	public void deleteAgent(Integer idAgent) {
		agentDAO.deleteAgent(idAgent);

	}

	@Override
	public Agent updateAgent(Agent agent) {
		return agentDAO.updateAgent(agent);
	}

	@Override
	public Agent getAgent(int Agentid) {
		return null;
	}
	
	public void setAgentDAO(AgentDAO agentDAO){
		this.agentDAO = agentDAO;
	}

}
