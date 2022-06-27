

package com.PorfolioNancy.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class educacion {
       @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
private Long idEdu;
private String tituloEdu;
private int fechaIni;
private int fechaTer;
private String descrEdu;
private String imageEdu;

    public educacion() {
    }

    public educacion(Long idEdu, String tituloEdu, int fechaIni, int fechaTer, String descrEdu, String imageEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaIni = fechaIni;
        this.fechaTer = fechaTer;
        this.descrEdu = descrEdu;
        this.imageEdu = imageEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
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

    public String getImageEdu() {
        return imageEdu;
    }

    public void setImageEdu(String imageEdu) {
        this.imageEdu = imageEdu;
    }


}
