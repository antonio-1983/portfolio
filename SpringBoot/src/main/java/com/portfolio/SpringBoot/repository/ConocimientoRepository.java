
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.modelo.Conocimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConocimientoRepository extends JpaRepository <Conocimiento,Long> {
    
}
