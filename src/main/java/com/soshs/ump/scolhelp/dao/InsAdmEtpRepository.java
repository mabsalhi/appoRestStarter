/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soshs.ump.scolhelp.dao;

import com.soshs.ump.scolhelp.domain.InsAdmEtp;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.WebApplicationException;
import java.util.List;

/**
 *
 * @author mabs
 */
@ApplicationScoped
public class InsAdmEtpRepository {
    
    @PersistenceContext(unitName = "apoJTA")
    private EntityManager entityManager;

    public List<InsAdmEtp> findAll() {
        return entityManager.createNamedQuery("InsAdmEtp.findAll", InsAdmEtp.class)
                .getResultList();
    }

    public InsAdmEtp findInsAdmEtpById(Long id) {
        try {
            InsAdmEtp insAdm = entityManager.find(InsAdmEtp.class, id);
            if (insAdm == null) {
                throw new WebApplicationException("InsAdmEtp with id of " + id + " does not exist.", 404);
            }
            return insAdm;
        } catch (NoResultException ex) {
            return null;
        }
    }

    public List findInsAdmEtpByInd(Long codInd) {
        return entityManager.createQuery("SELECT i FROM InsAdmEtp i WHERE i.codInd = :codInd")
                .setParameter("codInd", codInd).getResultList(); 
    }

    public InsAdmEtp findInsAdmEtpByAppo(Integer apo) {
        
            InsAdmEtp person = entityManager.createNamedQuery("InsAdmEtp.findByApogee", InsAdmEtp.class).setParameter("apogee", apo).getSingleResult();
            
            if (person == null) {
                throw new WebApplicationException("InsAdmEtp with masar of " + apo + " does not exist.", 404);
            }
            return person;
       
    }

//    public List<InsAdmEtp> findInsAdmEtpByNom(String nom) {
//        List<InsAdmEtp> individues = new ArrayList<>();
//        System.out.println("Recherche des personnes avec le nom : " + nom);
//        individues = entityManager.createNamedQuery("InsAdmEtp.findByNom", InsAdmEtp.class).getResultList();
//        System.out.println("le premier" + individues.get(0).getCin());
//        return individues;
//    }
    
}
