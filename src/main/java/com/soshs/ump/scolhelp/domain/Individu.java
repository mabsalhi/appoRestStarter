/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soshs.ump.scolhelp.domain;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author mabs
 */
@Entity
@Table(name = "individu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Individu.findAll", query = "SELECT i FROM Individu i"),
    @NamedQuery(name = "Individu.findByApogee", query = "SELECT i FROM Individu i WHERE i.apogee = :apogee"),
    @NamedQuery(name = "Individu.findByCin", query = "SELECT i FROM Individu i WHERE i.cin = :cin"),
    @NamedQuery(name = "Individu.findByNom", query = "SELECT i FROM Individu i WHERE i.nom = :nom")    
    })
public class Individu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_IND")
    private Long idIndividu;
    @Column(name = "cod_nne_ind")
    private String cne;
     @Column(name = "cod_etu")
    private Integer apogee;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cin_ind")
    private String cin;    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "lib_nom_pat_ind")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "lib_pr1_ind")
    private String prenom1;
    @Column(name = "date_nai_ind", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @Column(name = "LIB_VIL_NAI_ETU")
    private String lieuNiassance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "lib_nom_ind_arb")
    private String nomAr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "lib_prn_ind_arb")
    private String prenomAr;
    /*
    @OneToMany(mappedBy = "person")
    private List<Qualification> qualificationList;
    @OneToMany(mappedBy = "person")
    private List<Affectation> affectationList;
    @OneToMany(mappedBy = "person", cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Situation> situationList = new LinkedList<Situation>();
*/

    public Individu(Long idIndividu, String cne, Integer apogee, String cin, String nom, String prenom1, Date dateNaissance, String lieuNiassance, String nomAr, String prenomAr) {
        this.idIndividu = idIndividu;
        this.cne = cne;
        this.apogee = apogee;
        this.cin = cin;
        this.nom = nom;
        this.prenom1 = prenom1;
        this.dateNaissance = dateNaissance;
        this.lieuNiassance = lieuNiassance;
        this.nomAr = nomAr;
        this.prenomAr = prenomAr;
    }

    

    public Individu() {
    }

    public Long getIdIndividu() {
        return idIndividu;
    }

    public void setIdIndividu(Long idIndividu) {
        this.idIndividu = idIndividu;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Integer getApogee() {
        return apogee;
    }

    public void setApogee(Integer apogee) {
        this.apogee = apogee;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom1() {
        return prenom1;
    }

    public void setPrenom1(String prenom1) {
        this.prenom1 = prenom1;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNiassance() {
        return lieuNiassance;
    }

    public void setLieuNiassance(String lieuNiassance) {
        this.lieuNiassance = lieuNiassance;
    }

    public String getNomAr() {
        return nomAr;
    }

    public void setNomAr(String nomAr) {
        this.nomAr = nomAr;
    }

    public String getPrenomAr() {
        return prenomAr;
    }

    public void setPrenomAr(String prenomAr) {
        this.prenomAr = prenomAr;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idIndividu);
        hash = 47 * hash + Objects.hashCode(this.cne);
        hash = 47 * hash + Objects.hashCode(this.apogee);
        hash = 47 * hash + Objects.hashCode(this.cin);
        hash = 47 * hash + Objects.hashCode(this.nom);
        hash = 47 * hash + Objects.hashCode(this.prenom1);
        hash = 47 * hash + Objects.hashCode(this.dateNaissance);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Individu other = (Individu) obj;
        if (!Objects.equals(this.cin, other.cin)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom1, other.prenom1)) {
            return false;
        }
        if (!Objects.equals(this.idIndividu, other.idIndividu)) {
            return false;
        }
        if (!Objects.equals(this.cne, other.cne)) {
            return false;
        }
        if (!Objects.equals(this.apogee, other.apogee)) {
            return false;
        }
        return Objects.equals(this.dateNaissance, other.dateNaissance);
    }

    @Override
    public String toString() {
        return "Individu{" + "cin=" + cin + ", nom=" + nom + '}';
    }
   
}
