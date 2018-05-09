package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.AdministrateurDAO;
import com.wha.model.Administrateur;

@Service
@Transactional
public class AdministrateurServiceImpl implements AdministrateurService {

	@Autowired
    private AdministrateurDAO administrateurDAO;
 
    @Override
    @Transactional
    public void addAdministrateur(Administrateur administrateur) {
        administrateurDAO.addAdministrateur(administrateur);
    }
 
    @Override
    @Transactional
    public List<Administrateur> getAllAdministrateurs() {
        return administrateurDAO.getAllAdministrateurs();
    }
 
    @Override
    @Transactional
    public void deleteAdministrateur(Integer administrateurId) {
        administrateurDAO.deleteAdministrateur(administrateurId);
    }
 
    public Administrateur getAdministrateur(int administrateurId) {
        return administrateurDAO.getAdministrateur(administrateurId);
    }
 
    public Administrateur updateAdministrateur(Administrateur administrateur) {
        // TODO Auto-generated method stub
        return administrateurDAO.updateAdministrateur(administrateur);
    }
 
    public void setAdministrateurDAO(AdministrateurDAO administrateurDAO) {
        this.administrateurDAO = administrateurDAO;
    }

}
