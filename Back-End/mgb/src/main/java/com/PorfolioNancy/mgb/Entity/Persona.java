
package com.PorfolioNancy.mgb.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;




@Entity

public class Persona implements  Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO )
 @Column(nullable = false, updatable = false)
   private Long id;
   private String nombre;
   private String apellido;
   private String titulo;
   private String descripcion;
   private String fotoPerfil;
   
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idEdu");
   private List<educacion> educacionList;
}
