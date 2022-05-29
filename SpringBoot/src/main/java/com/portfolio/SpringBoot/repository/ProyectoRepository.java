
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.modelo.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
        
public interface ProyectoRepository extends JpaRepository <Proyecto,Long> {
    

    
}
