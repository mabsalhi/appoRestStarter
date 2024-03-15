/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soshs.ump.scolhelp.dao;

import com.soshs.ump.scolhelp.domain.Individu;
import com.soshs.ump.scolhelp.resources.Helper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import java.nio.charset.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabs
 */
@ApplicationScoped
public class IndividuRepository {
    
    @PersistenceContext(unitName = "apoJTA")
    private EntityManager entityManager;

    private Helper helper = new Helper();
    
    public List<Individu> findAll() {
        return entityManager.createNamedQuery("Individu.findAll", Individu.class)
                .getResultList();
    }

    public Individu findIndividuById(Long id) {
        try {
            Individu person = entityManager.find(Individu.class, id);
            if (person == null) {
                throw new WebApplicationException("Individu with id of " + id + " does not exist.", 404);
            }
            return person;
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Transactional
    public void updateTheIndividu(Long id, String name, String surname) {
        Individu individuToUpdate = findIndividuById(id);
        individuToUpdate.setNom(name);
        individuToUpdate.setPrenom1(surname);
    }

    @Transactional
    public void updateIndividu(Individu person) {
        entityManager.merge(person);
    }

    @Transactional
    public void createIndividu(Individu person) {
        entityManager.persist(person);
    }

    @Transactional
    public void deleteIndividu(Long personId) {
        Individu p = findIndividuById(personId);
        entityManager.remove(p);
    }

    public Individu findIndividuByCIN(String cin) {
        System.out.println("Debut de la transaction recherche " + cin);
        Individu individu = entityManager.createNamedQuery("Individu.findByCin", Individu.class).setParameter("cin", cin).getSingleResult();

        
        individu.setNomAr(helper.decodeApoAr(individu.getNomAr()));
        individu.setPrenomAr(helper.decodeApoAr(individu.getPrenomAr()));
        
        System.out.println("tout est normal");
        if (individu == null) {
            System.out.println("aucun individu");
            throw new WebApplicationException("Individu with cin of " + cin + " does not exist.", 404);
        }
        
        return individu;
    }

    public Individu findIndividuByAppo(Integer apo) {
        
            Individu person = entityManager.createNamedQuery("Individu.findByApogee", Individu.class).setParameter("apogee", apo).getSingleResult();
            
            if (person == null) {
                throw new WebApplicationException("Individu with masar of " + apo + " does not exist.", 404);
            }
            return person;
       
    }

//    public List<Individu> findIndividuByNom(String nom) {
//        List<Individu> individues = new ArrayList<>();
//        System.out.println("Recherche des personnes avec le nom : " + nom);
//        individues = entityManager.createNamedQuery("Individu.findByNom", Individu.class).getResultList();
//        System.out.println("le premier" + individues.get(0).getCin());
//        return individues;
//    }
    
}
