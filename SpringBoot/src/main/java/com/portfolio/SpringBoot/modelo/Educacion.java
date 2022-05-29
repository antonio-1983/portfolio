package com.portfolio.SpringBoot.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Educacion {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String titulo;
    private String desde;
    private String hasta;
    private Long id_persona;
    
    public Educacion(){}
    
    public Educacion(Long id, String nombre, String titulo,String desde,String hasta,Long id_persona){
        this.id=id;
        this.nombre=nombre;
        this.titulo=titulo;
        this.desde=desde;
        this.hasta=hasta;
        this.id_persona=id_persona;
    }
    
}
