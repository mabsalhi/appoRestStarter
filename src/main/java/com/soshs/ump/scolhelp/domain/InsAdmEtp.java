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
 * @author SG-FSJESO
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mabs
 */
@Entity
@Table(name = "INS_ADM_ETP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InsAdmEtp.findAll", query = "SELECT i FROM InsAdmEtp i"),
    @NamedQuery(name = "InsAdmEtp.findByInd", query = "SELECT i FROM InsAdmEtp i WHERE i.codInd = :codInd")   
    })
public class InsAdmEtp implements Serializable {
   
    private static final long serialVersionUID = 1L;
     
    @Column(name = "COD_ANU")
    private Long codAnu;
    @Id
    @Column(name = "COD_IND")
    private Long codInd;
    @Column(name = "COD_ETP")
    private String codEtp;
     @Column(name = "cod_dip")
    private String codDip;
    @Column(name = "ETA_IAE")
    private String etatIAE;
    /*
    @OneToMany(mappedBy = "person")
    private List<Qualification> qualificationList;
    @OneToMany(mappedBy = "person")
    private List<Affectation> affectationList;
    @OneToMany(mappedBy = "person", cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Situation> situationList = new LinkedList<Situation>();
*/

    public InsAdmEtp() {
    }

    public InsAdmEtp(Long codAnu, Long codInd, String codEtp, String codDip, String etatIAE) {
        this.codAnu = codAnu;
        this.codInd = codInd;
        this.codEtp = codEtp;
        this.codDip = codDip;
        this.etatIAE = etatIAE;
    }

    public Long getCodAnu() {
        return codAnu;
    }

    public void setCodAnu(Long codAnu) {
        this.codAnu = codAnu;
    }

    public Long getCodInd() {
        return codInd;
    }

    public void setCodInd(Long codInd) {
        this.codInd = codInd;
    }

    public String getCodEtp() {
        return codEtp;
    }

    public void setCodEtp(String codEtp) {
        this.codEtp = codEtp;
    }

    public String getCodDip() {
        return codDip;
    }

    public void setCodDip(String codDip) {
        this.codDip = codDip;
    }

    public String getEtatIAE() {
        return etatIAE;
    }

    public void setEtatIAE(String etatIAE) {
        this.etatIAE = etatIAE;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.codAnu);
        hash = 61 * hash + Objects.hashCode(this.codInd);
        hash = 61 * hash + Objects.hashCode(this.codEtp);
        hash = 61 * hash + Objects.hashCode(this.codDip);
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
        final InsAdmEtp other = (InsAdmEtp) obj;
        if (!Objects.equals(this.codEtp, other.codEtp)) {
            return false;
        }
        if (!Objects.equals(this.codDip, other.codDip)) {
            return false;
        }
        if (!Objects.equals(this.etatIAE, other.etatIAE)) {
            return false;
        }
        if (!Objects.equals(this.codAnu, other.codAnu)) {
            return false;
        }
        return Objects.equals(this.codInd, other.codInd);
    }

   

    @Override
    public String toString() {
        return "InsAdmEtp{" + "codAnu=" + codAnu + ", codInd=" + codInd + ", codEtp=" + codEtp + ", codDip=" + codDip + ", etatIAE=" + etatIAE + '}';
    }

    
}
