/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PorfolioNancy.mgb.Service;

import com.PorfolioNancy.mgb.Entity.Experiencia;
import com.PorfolioNancy.mgb.Entity.educacion;
import com.PorfolioNancy.mgb.Repository.educacionRepo;
import com.PorfolioNancy.mgb.Repository.experienciaRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class experienciaService {
      private final experienciaRepo experienciaRepo;
    @Autowired
     public experienciaService (experienciaRepo experienciaRepo){
         this.experienciaRepo=experienciaRepo;
}
        public Experiencia addExperiencia(Experiencia Experiencia){
             return experienciaRepo.save(Experiencia); 
        
     }
         public List<Experiencia> buscarExperiencia(){
             return experienciaRepo.findAll();
         }
         public Experiencia editarExperiencia (Experiencia Experiencia){
             return experienciaRepo.save(Experiencia);
         }
         public void borrarEdicion(Long id){
    experienciaRepo.deleteById(id);
}
     } 
