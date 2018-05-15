package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.CompteDAO;
import com.wha.model.Compte;

@Service
@Transactional
public class CompteServiceImpl implements CompteService {

	@Autowired
    private CompteDAO compteDAO;
 
    @Override
    @Transactional
    public void addCompte(Compte compte) {
        compteDAO.addCompte(compte);
    }
 
    @Override
    @Transactional
    public List<Compte> getAllComptes() {
        return compteDAO.getAllComptes();
    }
 
    @Override
    @Transactional
    public void deleteCompte(Integer compteId) {
        compteDAO.deleteCompte(compteId);
    }
 
    public Compte getCompte(int empid) {
        return compteDAO.getCompte(empid);
    }
 
    public Compte updateCompte(Compte compte) {
        // TODO Auto-generated method stub
        return compteDAO.updateCompte(compte);
    }
 
    public void setCompteDAO(CompteDAO compteDAO) {
        this.compteDAO = compteDAO;
    }

}
