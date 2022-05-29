package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.modelo.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia,Long>{
   
}
