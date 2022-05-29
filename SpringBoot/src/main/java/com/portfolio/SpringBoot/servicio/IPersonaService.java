package com.portfolio.SpringBoot.servicio;

import com.portfolio.SpringBoot.modelo.Persona;
import java.util.List;

public interface IPersonaService {
         public List<Persona> verPersona();
    public void crearPersona(Persona p);
    public void borrarPersona(Long id);
    public Persona buscarPersona (Long id);
}
