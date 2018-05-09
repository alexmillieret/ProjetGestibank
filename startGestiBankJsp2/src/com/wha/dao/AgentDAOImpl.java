package com.wha.dao;

import java.util.List; 

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.wha.model.Agent;

@Repository
public class AgentDAOImpl implements AgentDAO {

	public AgentDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	 public void addAgent(Agent agent) {
	        sessionFactory.getCurrentSession().saveOrUpdate(agent);
	 
	    }
	 
	    @SuppressWarnings("unchecked")
	    public List<Agent> getAllAgent() {
	 
	        return sessionFactory.getCurrentSession().createQuery("from Employee")
	                .list();
	    }
	 
	    @Override
	    public void deleteAgent(Integer idAgent) {
	        Agent agent = (Agent) sessionFactory.getCurrentSession().load(
	                Agent.class, idAgent);
	        if (null != agent) {
	            this.sessionFactory.getCurrentSession().delete(agent);
	        }
	 
	    }
	 
	    public Agent getAgent(int agentid) {
	        return (Agent) sessionFactory.getCurrentSession().get(
	                Agent.class, agentid);
	    }
	 
	    @Override
	    public Agent updateAgent(Agent agent) {
	        sessionFactory.getCurrentSession().update(agent);
	        return agent;
	    }


		

}
