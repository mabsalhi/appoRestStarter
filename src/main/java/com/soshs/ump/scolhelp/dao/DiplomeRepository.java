/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soshs.ump.scolhelp.dao;

import com.soshs.ump.scolhelp.domain.Diplome;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.WebApplicationException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabs
 */
@ApplicationScoped
public class DiplomeRepository {
    
    @PersistenceContext(unitName = "apoJTA")
    private EntityManager entityManager;

    public List<Diplome> findAll() {
        return entityManager.createNamedQuery("Diplome.findAll", Diplome.class)
                .getResultList();
    }

    public Diplome findDiplomeById(Long id) {
        try {
            Diplome insAdm = entityManager.find(Diplome.class, id);
            if (insAdm == null) {
                throw new WebApplicationException("Diplome with id of " + id + " does not exist.", 404);
            }
            return insAdm;
        } catch (NoResultException ex) {
            return null;
        }
    }

    public List findDiplomeByCyc(String codCyc) {
        return entityManager.createQuery("SELECT d FROM Diplome d WHERE d.COD_CYC = :codCyc")
                .setParameter("codCyc", codCyc).getResultList(); 
    }

    

    public List<Diplome> findDiplomeByCycle(String cyc, String etb) {
        List<Diplome> diplomes = new ArrayList<>();
        System.out.println("Recherche des personnes avec le cycle : " + cyc);
        diplomes = entityManager.createNamedQuery("Diplome.findByCyc", Diplome.class).setParameter("codCyc", cyc).getResultList();
        System.out.println("le premier" + diplomes.get(0).getCodDip());
        return diplomes;
    }
    
}
