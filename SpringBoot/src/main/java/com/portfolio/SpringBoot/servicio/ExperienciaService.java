package com.portfolio.SpringBoot.servicio;

import com.portfolio.SpringBoot.modelo.Experiencia;
import com.portfolio.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository experienciaRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
      return experienciaRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia e) {
      experienciaRepo.save(e);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return experienciaRepo.findById(id).orElse(null);
    }
    
    
}
