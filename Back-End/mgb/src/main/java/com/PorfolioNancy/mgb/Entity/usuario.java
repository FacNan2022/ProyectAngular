
package com.PorfolioNancy.mgb.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String fotoPerfil;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
private List<educacion>educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkills")
private List<skills> skillsList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
private List<Experiencia> experienciaList;
    
}







