
package com.PorfolioNancy.mgb.Repository;

import com.PorfolioNancy.mgb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
