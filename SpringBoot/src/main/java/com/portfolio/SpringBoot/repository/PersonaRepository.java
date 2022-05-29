package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona ,Long>{
    
}
