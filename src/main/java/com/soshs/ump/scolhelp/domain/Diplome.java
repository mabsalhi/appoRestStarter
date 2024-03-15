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
@Table(name = "DIPLOME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diplome.findAll", query = "SELECT d FROM Diplome d"),
    @NamedQuery(name = "Diplome.findByCod", query = "SELECT d FROM Diplome d WHERE d.codDip = :codDip"),
    @NamedQuery(name = "Diplome.findByCyc", query = "SELECT d FROM Diplome d WHERE d.COD_CYC = :codCyc AND d.COD_ETB = :codEtb")
    })
public class Diplome implements Serializable{
      private static final long serialVersionUID = 1L;
     
    @Id
    @Column(name = "COD_DIP")
    private String codDip;
    @Column(name = "COD_NDI")
    private String codNDI;
    @Column(name = "COD_TPD_ETB")
    private String COD_TPD_ETB;
     @Column(name = "COD_CYC")
    private String COD_CYC;
    @Column(name = "COD_NIM")
    private String COD_NIM;
    @Column(name = "COD_ETB")
    private String COD_ETB;
    @Column(name = "COD_SDS")
    private String COD_SDS;
    @Column(name = "LIB_DIP")
    private String libDip;
    @Column(name = "LIC_DIP")
    private String LIC_DIP;
    @Column(name = "NBR_MAX_INSC_DEUG")
    private int NBR_MAX_INSC_DEUG;
    @Column(name = "TEM_COU_ACC_TRV_DIP")
    private String TEM_COU_ACC_TRV_DIP;
    @Column(name = "TEM_OUV_DRT_SSO_DIP")
    private String TEM_OUV_DRT_SSO_DIP;
    @Column(name = "LIB_DIP_ARB")
    private String LIB_DIP_ARB;
     @Column(name = "LIC_DIP_ARB")
    private String LIC_DIP_ARB;
    @Column(name = "COD_PER")
    private int COD_PER;

    public Diplome(String codDip, String codNDI, String COD_TPD_ETB, String COD_CYC, String COD_NIM, String COD_ETB, String COD_SDS, String libDip, String LIC_DIP, int NBR_MAX_INSC_DEUG, String TEM_COU_ACC_TRV_DIP, String TEM_OUV_DRT_SSO_DIP, String LIB_DIP_ARB, String LIC_DIP_ARB, int COD_PER) {
        this.codDip = codDip;
        this.codNDI = codNDI;
        this.COD_TPD_ETB = COD_TPD_ETB;
        this.COD_CYC = COD_CYC;
        this.COD_NIM = COD_NIM;
        this.COD_ETB = COD_ETB;
        this.COD_SDS = COD_SDS;
        this.libDip = libDip;
        this.LIC_DIP = LIC_DIP;
        this.NBR_MAX_INSC_DEUG = NBR_MAX_INSC_DEUG;
        this.TEM_COU_ACC_TRV_DIP = TEM_COU_ACC_TRV_DIP;
        this.TEM_OUV_DRT_SSO_DIP = TEM_OUV_DRT_SSO_DIP;
        this.LIB_DIP_ARB = LIB_DIP_ARB;
        this.LIC_DIP_ARB = LIC_DIP_ARB;
        this.COD_PER = COD_PER;
    }

    public Diplome() {
    }

    public String getCodDip() {
        return codDip;
    }

    public void setCodDip(String codDip) {
        this.codDip = codDip;
    }

    public String getCodNDI() {
        return codNDI;
    }

    public void setCodNDI(String codNDI) {
        this.codNDI = codNDI;
    }

    public String getCOD_TPD_ETB() {
        return COD_TPD_ETB;
    }

    public void setCOD_TPD_ETB(String COD_TPD_ETB) {
        this.COD_TPD_ETB = COD_TPD_ETB;
    }

    public String getCOD_CYC() {
        return COD_CYC;
    }

    public void setCOD_CYC(String COD_CYC) {
        this.COD_CYC = COD_CYC;
    }

    public String getCOD_NIM() {
        return COD_NIM;
    }

    public void setCOD_NIM(String COD_NIM) {
        this.COD_NIM = COD_NIM;
    }

    public String getCOD_ETB() {
        return COD_ETB;
    }

    public void setCOD_ETB(String COD_ETB) {
        this.COD_ETB = COD_ETB;
    }

    public String getCOD_SDS() {
        return COD_SDS;
    }

    public void setCOD_SDS(String COD_SDS) {
        this.COD_SDS = COD_SDS;
    }

    public String getLibDip() {
        return libDip;
    }

    public void setLibDip(String libDip) {
        this.libDip = libDip;
    }

    public String getLIC_DIP() {
        return LIC_DIP;
    }

    public void setLIC_DIP(String LIC_DIP) {
        this.LIC_DIP = LIC_DIP;
    }

    public int getNBR_MAX_INSC_DEUG() {
        return NBR_MAX_INSC_DEUG;
    }

    public void setNBR_MAX_INSC_DEUG(int NBR_MAX_INSC_DEUG) {
        this.NBR_MAX_INSC_DEUG = NBR_MAX_INSC_DEUG;
    }

    public String getTEM_COU_ACC_TRV_DIP() {
        return TEM_COU_ACC_TRV_DIP;
    }

    public void setTEM_COU_ACC_TRV_DIP(String TEM_COU_ACC_TRV_DIP) {
        this.TEM_COU_ACC_TRV_DIP = TEM_COU_ACC_TRV_DIP;
    }

    public String getTEM_OUV_DRT_SSO_DIP() {
        return TEM_OUV_DRT_SSO_DIP;
    }

    public void setTEM_OUV_DRT_SSO_DIP(String TEM_OUV_DRT_SSO_DIP) {
        this.TEM_OUV_DRT_SSO_DIP = TEM_OUV_DRT_SSO_DIP;
    }

    public String getLIB_DIP_ARB() {
        return LIB_DIP_ARB;
    }

    public void setLIB_DIP_ARB(String LIB_DIP_ARB) {
        this.LIB_DIP_ARB = LIB_DIP_ARB;
    }

    public String getLIC_DIP_ARB() {
        return LIC_DIP_ARB;
    }

    public void setLIC_DIP_ARB(String LIC_DIP_ARB) {
        this.LIC_DIP_ARB = LIC_DIP_ARB;
    }

    public int getCOD_PER() {
        return COD_PER;
    }

    public void setCOD_PER(int COD_PER) {
        this.COD_PER = COD_PER;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.codDip);
        hash = 29 * hash + Objects.hashCode(this.codNDI);
        hash = 29 * hash + Objects.hashCode(this.COD_TPD_ETB);
        hash = 29 * hash + Objects.hashCode(this.COD_CYC);
        hash = 29 * hash + Objects.hashCode(this.COD_NIM);
        hash = 29 * hash + Objects.hashCode(this.COD_ETB);
        hash = 29 * hash + Objects.hashCode(this.COD_SDS);
        hash = 29 * hash + Objects.hashCode(this.libDip);
        hash = 29 * hash + Objects.hashCode(this.LIC_DIP);
        hash = 29 * hash + this.NBR_MAX_INSC_DEUG;
        hash = 29 * hash + Objects.hashCode(this.TEM_COU_ACC_TRV_DIP);
        hash = 29 * hash + Objects.hashCode(this.TEM_OUV_DRT_SSO_DIP);
        hash = 29 * hash + Objects.hashCode(this.LIB_DIP_ARB);
        hash = 29 * hash + Objects.hashCode(this.LIC_DIP_ARB);
        hash = 29 * hash + this.COD_PER;
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
        final Diplome other = (Diplome) obj;
        if (this.NBR_MAX_INSC_DEUG != other.NBR_MAX_INSC_DEUG) {
            return false;
        }
        if (this.COD_PER != other.COD_PER) {
            return false;
        }
        if (!Objects.equals(this.codDip, other.codDip)) {
            return false;
        }
        if (!Objects.equals(this.codNDI, other.codNDI)) {
            return false;
        }
        if (!Objects.equals(this.COD_TPD_ETB, other.COD_TPD_ETB)) {
            return false;
        }
        if (!Objects.equals(this.COD_CYC, other.COD_CYC)) {
            return false;
        }
        if (!Objects.equals(this.COD_NIM, other.COD_NIM)) {
            return false;
        }
        if (!Objects.equals(this.COD_ETB, other.COD_ETB)) {
            return false;
        }
        if (!Objects.equals(this.COD_SDS, other.COD_SDS)) {
            return false;
        }
        if (!Objects.equals(this.libDip, other.libDip)) {
            return false;
        }
        if (!Objects.equals(this.LIC_DIP, other.LIC_DIP)) {
            return false;
        }
        if (!Objects.equals(this.TEM_COU_ACC_TRV_DIP, other.TEM_COU_ACC_TRV_DIP)) {
            return false;
        }
        if (!Objects.equals(this.TEM_OUV_DRT_SSO_DIP, other.TEM_OUV_DRT_SSO_DIP)) {
            return false;
        }
        if (!Objects.equals(this.LIB_DIP_ARB, other.LIB_DIP_ARB)) {
            return false;
        }
        return Objects.equals(this.LIC_DIP_ARB, other.LIC_DIP_ARB);
    }

    @Override
    public String toString() {
        return "Diplome{" + "codNDI=" + codNDI + ", LIC_DIP=" + LIC_DIP + '}';
    }
   
    
}
