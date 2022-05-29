package com.portfolio.SpringBoot.servicio;

import com.portfolio.SpringBoot.modelo.Conocimiento;
import com.portfolio.SpringBoot.repository.ConocimientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConocimientoService implements IConocimientoService{
    @Autowired
    public ConocimientoRepository conocimientoRepo;
    
    @Override
    public List<Conocimiento> verConocimiento() {
      return conocimientoRepo.findAll();
    }

    @Override
    public void crearConocimiento(Conocimiento c) {
      conocimientoRepo.save(c);
    }

    @Override
    public void borrarConocimiento(Long id) {
        conocimientoRepo.deleteById(id);
    }

    @Override
    public Conocimiento buscarConocimiento(Long id) {
        return conocimientoRepo.findById(id).orElse(null);
    }
    
    
}
