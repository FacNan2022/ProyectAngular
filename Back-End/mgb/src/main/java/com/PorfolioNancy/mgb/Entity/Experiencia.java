

package com.PorfolioNancy.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pc
 */@Entity
public class Experiencia {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
private Long idExp;
private String tituloExp;
private int fechaIni;
private int fechaTer;
private String descrEdu;
private String imageExp;

public Experiencia(){
    
}

    public Experiencia(Long idExp, String tituloExp, int fechaIni, int fechaTer, String descrEdu, String imageExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaIni = fechaIni;
        this.fechaTer = fechaTer;
        this.descrEdu = descrEdu;
        this.imageExp = imageExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public int getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(int fechaIni) {
        this.fechaIni = fechaIni;
    }

    public int getFechaTer() {
        return fechaTer;
    }

    public void setFechaTer(int fechaTer) {
        this.fechaTer = fechaTer;
    }

    public String getDescrEdu() {
        return descrEdu;
    }

    public void setDescrEdu(String descrEdu) {
        this.descrEdu = descrEdu;
    }

    public String getImageExp() {
        return imageExp;
    }

    public void setImageExp(String imageExp) {
        this.imageExp = imageExp;
    }

}
