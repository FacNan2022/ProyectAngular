
package com.PorfolioNancy.mgb.controler;

import com.PorfolioNancy.mgb.Entity.Persona;
import com.PorfolioNancy.mgb.Interfaces.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin (origins = "http://localhost:4200")
public class Personacontroler {
    @Autowired IPersonaService ipersonaservice;

    @GetMapping("Personas/traer")
    
    
    public List<Persona> getPersona(){
    return ipersonaservice.getPersona();
}
@PostMapping("/Personas/Crear")
public String createPersona(@RequestBody Persona persona){
    ipersonaservice.savePersona(persona);
return "La Persona se creo con éxito";
}
@DeleteMapping("Personas/Borrar/(id)")
public String deletePersona(@PathVariable Long id){
    ipersonaservice.deletePersona(id);
            return"La persona se elimino conéxito";
}
@PutMapping("/Personas/Editar/(id)*")
public Persona editPersona(@PathVariable Long id,
            @RequestParam ("nombre") String nuevoNombre,
            @RequestParam ("apellido") String nuevoApellido,
            @RequestParam ("img") String nuevoImg){
    Persona persona = ipersonaservice.findPersona(id);
    persona.setNombre(nuevoNombre);
    persona.setApellido(nuevoApellido);
    persona.setImg(nuevoImg);
    ipersonaservice.savePersona(persona);
    return persona;
}
@GetMapping("/personas/traer/perfil")
public Persona findPersona(){
    return ipersonaservice.findPersona((long)1);
} 

}
