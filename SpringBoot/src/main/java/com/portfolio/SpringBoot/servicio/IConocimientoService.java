package com.portfolio.SpringBoot.servicio;

import com.portfolio.SpringBoot.modelo.Conocimiento;
import java.util.List;

public interface IConocimientoService {
    public List<Conocimiento> verConocimiento();
    public void crearConocimiento(Conocimiento c);
    public void borrarConocimiento(Long id);
    public Conocimiento buscarConocimiento (Long id);
}
