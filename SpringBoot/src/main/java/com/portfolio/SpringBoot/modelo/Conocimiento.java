package com.portfolio.SpringBoot.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Conocimiento {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    private String tecnologia;
    private String nivel;
    private Long id_persona;


public Conocimiento(){}

public Conocimiento(Long id, String tecnologia,String nivel,Long id_persona){
    this.id=id;
    this.tecnologia=tecnologia;
    this.nivel=nivel;
    this.id_persona=id_persona;
}

}