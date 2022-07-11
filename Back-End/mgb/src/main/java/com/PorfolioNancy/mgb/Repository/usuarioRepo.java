
package com.PorfolioNancy.mgb.Repository;

import com.PorfolioNancy.mgb.Entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface usuarioRepo extends JpaRepository<usuario,Long> {
    
}
