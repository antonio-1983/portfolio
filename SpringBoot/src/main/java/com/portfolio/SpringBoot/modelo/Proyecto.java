package com.portfolio.SpringBoot.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    private String descripcion;
    private String repositorio;
    private String imagen;
    private Long id_persona;


public Proyecto(){}

public Proyecto(Long id, String descripcion ,String repositorio,String imagen, Long id_persona){
    this.id=id;
    this.descripcion=descripcion;
    this.repositorio=repositorio;
    this.imagen=imagen;
    this.id_persona=id_persona;
}

}