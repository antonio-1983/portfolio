package com.portfolio.SpringBoot.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Experiencia {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    private String empresa;
    private String puesto;
    private String desde;
    private String hasta;
    private Long id_persona;
    
    public Experiencia (){}
    
    public Experiencia(Long id, String empresa, String puesto,String desde,String hasta,Long id_persona){
        this.id=id;
        this.empresa=empresa;
        this.desde=desde;
        this.hasta=hasta;
        this.id_persona=id_persona;
    }
}
