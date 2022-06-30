/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PorfolioNancy.mgb.Repository;

import com.PorfolioNancy.mgb.Entity.skills;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author pc
 */
public interface skillsRepo extends JpaRepository<skills, Long>{
    
}
