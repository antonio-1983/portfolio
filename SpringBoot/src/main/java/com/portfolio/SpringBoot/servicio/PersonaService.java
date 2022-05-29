package com.portfolio.SpringBoot.servicio;
import com.portfolio.SpringBoot.modelo.Persona;
import com.portfolio.SpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository personaRepo;
    
    @Override
    public List<Persona> verPersona() {
      return personaRepo.findAll();
    }

    @Override
    public void crearPersona(Persona p) {
      personaRepo.save(p);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return personaRepo.findById(id).orElse(null);
    }
    
    
}

