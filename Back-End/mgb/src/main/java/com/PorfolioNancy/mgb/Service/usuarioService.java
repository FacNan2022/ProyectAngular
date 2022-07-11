
package com.PorfolioNancy.mgb.Service;

import com.PorfolioNancy.mgb.Entity.usuario;
import com.PorfolioNancy.mgb.Repository.usuarioRepo;
import exeption.UserNotFoundExeption;


import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class usuarioService {
    private final usuarioRepo usuarioRepo;
    
    @Autowired
    public usuarioService(usuarioRepo usuarioRepo){
        this.usuarioRepo = usuarioRepo;
}
public usuario addUsuario (usuario usuario){
             return usuarioRepo.save(usuario);
        
     }
         public List<usuario>buscarUsuario(){
             return usuarioRepo.findAll();
         }
         public usuario editUsuario (usuario usuario){
             return usuarioRepo.save(usuario);
         }
         public void borrarEdicion(Long id){
    usuarioRepo.deleteById(id);
}

    public usuario obtenerUsuarioPorId(Long id) {
       return usuarioRepo.findById(id).orElseThrow(()->new UserNotFoundExeption("usuario no encontrado"));
    }

     } 
