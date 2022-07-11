
package com.PorfolioNancy.mgb.controler;


import com.PorfolioNancy.mgb.Entity.usuario;
import com.PorfolioNancy.mgb.Service.usuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/usuario")

public class usuarioController {
    private final usuarioService usuarioService;
    
        public usuarioController(usuarioService usuarioService){
            this.usuarioService=usuarioService;
        }
        
    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/id/{id}")
       public ResponseEntity<usuario> obtenerUsuario(@PathVariable(name = "id") Long id){
           usuario usuario=usuarioService.obtenerUsuarioPorId(id);
           return new ResponseEntity<>(usuario, HttpStatus.OK);
        }
        
    /**
     *
     * @param usuario
     * @return
     */
    @PutMapping("/update")
        public ResponseEntity<usuario> editUsuario(@RequestBody usuario usuario ){
            usuario updateUsuario=usuarioService.editUsuario(usuario);
            return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
        } 
}