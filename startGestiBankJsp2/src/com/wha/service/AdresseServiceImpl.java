package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.AdresseDAO;
import com.wha.model.Adresse;

@Service
@Transactional
public class AdresseServiceImpl implements AdresseService {

	@Autowired
    private AdresseDAO adresseDAO;
 
    @Override
    @Transactional
    public void addAdresse(Adresse adresse) {
        adresseDAO.addAdresse(adresse);
    }
 
    @Override
    @Transactional
    public List<Adresse> getAllAdresses() {
        return adresseDAO.getAllAdresses();
    }
 
    @Override
    @Transactional
    public void deleteAdresse(Integer adresseId) {
        adresseDAO.deleteAdresse(adresseId);
    }
 
    public Adresse getAdresse(int adresseId) {
        return adresseDAO.getAdresse(adresseId);
    }
 
    public Adresse updateAdresse(Adresse adresse) {
        // TODO Auto-generated method stub
        return adresseDAO.updateAdresse(adresse);
    }
 
    public void setAdresseDAO(AdresseDAO adresseDAO) {
        this.adresseDAO = adresseDAO;
    }

}
