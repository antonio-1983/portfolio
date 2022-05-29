package com.portfolio.SpringBoot.servicio;

import com.portfolio.SpringBoot.modelo.Educacion;
import com.portfolio.SpringBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository educacionRepo;
    
    @Override
    public List<Educacion> verEducacion() {
      return educacionRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion ed) {
      educacionRepo.save(ed);
    }

    @Override
    public void borrarEducacion(Long id) {
        educacionRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educacionRepo.findById(id).orElse(null);
    }
    
    
}

