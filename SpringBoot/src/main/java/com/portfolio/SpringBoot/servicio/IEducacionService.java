package com.portfolio.SpringBoot.servicio;

import com.portfolio.SpringBoot.modelo.Educacion;
import java.util.List;

public interface IEducacionService {
     public List<Educacion> verEducacion();
    public void crearEducacion(Educacion ed);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion (Long id);
}
