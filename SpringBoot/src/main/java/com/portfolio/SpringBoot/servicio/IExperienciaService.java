package com.portfolio.SpringBoot.servicio;

import com.portfolio.SpringBoot.modelo.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> verExperiencia();
    public void crearExperiencia(Experiencia e);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia (Long id);
}
