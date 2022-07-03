/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PorfolioNancy.mgb.controler;

import com.PorfolioNancy.mgb.Entity.usuario;
import com.PorfolioNancy.mgb.Service.usuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class usuarioController {
    private final usuarioService usuarioService;
        public usuarioController(usuarioService usuarioService){
            this.usuarioService =usuarioService;
        }
        @GetMapping("/id/{id}")
        public ResponseEntity <usuario> obtenerUsuario(@PathVariable("id")Long id){
usuario usuario= usuarioService.buscarUsuario(id);
return new ResponseEntity <> (usuario, HttpStatus.OK);
        }
        @PutMapping("/update")
        public ResponseEntity<usuario> editarUsuario(@RequestBody usuario usuario ){
            usuario updateUsuario=usuarioService.editarUsuario(usuario);
            return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
        } 
}