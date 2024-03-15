/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soshs.ump.scolhelp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author SG-FSJESO
 */
@Entity
@Table(name = "ETAPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etape.findAll", query = "SELECT e FROM Etape e"),
    @NamedQuery(name = "Etape.findByCod", query = "SELECT e FROM Etape e WHERE e.codEtp = :codEtp")    
    })
public class Etape implements Serializable{
      private static final long serialVersionUID = 1L;
     
    @Id
    @Column(name = "COD_ETP")
    private String codEtp;
    @Column(name = "LIB_ETP")
    private String libEtp;

    public Etape(String codEtp, String libEtp) {
        this.codEtp = codEtp;
        this.libEtp = libEtp;
    }

    public Etape() {
    }

    public String getCodEtp() {
        return codEtp;
    }

    public void setCodEtp(String codEtp) {
        this.codEtp = codEtp;
    }

    public String getLibEtp() {
        return libEtp;
    }

    public void setLibEtp(String libEtp) {
        this.libEtp = libEtp;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.codEtp);
        hash = 29 * hash + Objects.hashCode(this.libEtp);
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
        final Etape other = (Etape) obj;
        if (!Objects.equals(this.codEtp, other.codEtp)) {
            return false;
        }
        return Objects.equals(this.libEtp, other.libEtp);
    }

    @Override
    public String toString() {
        return "Etape{" + "codEtp=" + codEtp + ", libEtp=" + libEtp + '}';
    }
   
    
    
    
}
