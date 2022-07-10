

package com.PorfolioNancy.mgb.controler;

import com.PorfolioNancy.mgb.Entity.educacion;
import com.PorfolioNancy.mgb.Service.educacionService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
public class educacionController {

        private final educacionService educacionService;
        public educacionController(educacionService educacionService){
            this.educacionService=educacionService;
        }
        @GetMapping("/all")
        public ResponseEntity<List<educacion>> obtenerEducacion(){
List<educacion>educaciones=educacionService.buscarEducacion();
return new ResponseEntity <> (educaciones, HttpStatus.OK);
        }
        @PutMapping("/update")
        public ResponseEntity<educacion> editaeEducacion(@RequestBody educacion educacion ){
            educacion updateEducacion=educacionService.editaeEducacion(educacion);
            return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
        } 
       
        @PostMapping("/add")
        public ResponseEntity<educacion>crearEducacion (@RequestBody educacion educacion){
       educacion nuevaEducacion=educacionService.addEducacion(educacion);
       return new ResponseEntity <> (nuevaEducacion, HttpStatus.CREATED);
        }

    /**
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
        public ResponseEntity<?>borrarEducacion(@PathVariable("id") Long id){
        return new ResponseEntity<>(HttpStatus.OK);
        }
        }
                
