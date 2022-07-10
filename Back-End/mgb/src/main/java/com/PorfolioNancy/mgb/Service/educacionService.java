/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PorfolioNancy.mgb.Service;

import com.PorfolioNancy.mgb.Entity.educacion;
import com.PorfolioNancy.mgb.Repository.educacionRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class educacionService {
    private final educacionRepo educacionRepo;
    @Autowired
     public educacionService (educacionRepo educacionRepo){
         this.educacionRepo=educacionRepo;
          }
         public educacion addEducacion (educacion educacion){
             return educacionRepo.save(educacion); 
        
     }
         public List<educacion> buscarEducacion(){
             return educacionRepo.findAll();
         }
         public educacion editaeEducacion (educacion educacion){
             return educacionRepo.save(educacion);
         }
         public void borrarEducacion(Long id){
    educacionRepo.deleteById(id);
}
     } 
