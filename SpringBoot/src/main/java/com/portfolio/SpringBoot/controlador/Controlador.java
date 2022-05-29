package com.portfolio.SpringBoot.controlador;

import com.portfolio.SpringBoot.modelo.Conocimiento;
import com.portfolio.SpringBoot.modelo.Educacion;
import com.portfolio.SpringBoot.modelo.Experiencia;
import com.portfolio.SpringBoot.modelo.Persona;
import com.portfolio.SpringBoot.modelo.Proyecto;
import com.portfolio.SpringBoot.servicio.IConocimientoService;
import com.portfolio.SpringBoot.servicio.IEducacionService;
import com.portfolio.SpringBoot.servicio.IExperienciaService;
import com.portfolio.SpringBoot.servicio.IPersonaService;
import com.portfolio.SpringBoot.servicio.IProyectoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class Controlador {
    
   @Autowired
   private IExperienciaService experServ;
   
   @Autowired
   private IConocimientoService conocimientoServ;
   
   @Autowired
   private IEducacionService educacionServ;
   
   @Autowired
   private IPersonaService personaServ;
   
   @Autowired
   private IProyectoService proyectoServ;
   
   /********************* PERSONA *********************/
     
    @PostMapping ("/new/persona")
   public void crearPersona (@RequestBody Persona p){
   personaServ.crearPersona(p);
   }
   
   @GetMapping ("/ver/personas")
   @ResponseBody
   public List<Persona> verPersona(){
       return personaServ.verPersona();
   }
   
   @DeleteMapping ("/delete/persona/{id}")
   public void borrarPersona(@PathVariable Long id){
       personaServ.borrarPersona(id);
       
   }
   
   @PutMapping ("/edit/persona")
   public void editarPersona(@RequestBody Persona p){
   personaServ.crearPersona(p);
   }
   
   @GetMapping ("/buscar/persona/{id}")
   public Persona buscarPersona(@PathVariable Long id){
     return personaServ.buscarPersona(id);
   }
   
   
  /***************************EDUCACION*************************/
   
      @PostMapping ("/new/educacion")
   public void crearEducacion (@RequestBody Educacion ed){
   educacionServ.crearEducacion(ed);
   }
   
   @GetMapping ("/ver/educaciones")
   @ResponseBody
   public List<Educacion> verEducacion(){
       return educacionServ.verEducacion();
   }
   
   @DeleteMapping ("/delete/educacion/{id}")
   public void borrarEducacion(@PathVariable Long id){
       educacionServ.borrarEducacion(id);
   }
   
   @PutMapping ("/edit/educacion")
   public void editarEducacion(@RequestBody Educacion ed){
   educacionServ.crearEducacion(ed);
   }
   
   @GetMapping ("/buscar/educacion/{id}")
   public Educacion buscarEducacion(@PathVariable Long id){
     return educacionServ.buscarEducacion(id);
   }
   
   /*****************CONOCIMIENTO*************************************** */
   
   @PostMapping ("/new/conocimiento")
   public void crearConocimiento (@RequestBody Conocimiento c){
   conocimientoServ.crearConocimiento(c);
   }
   
   @GetMapping ("/ver/conocimientos")
   @ResponseBody
   public List<Conocimiento> verConocimiento(){
       return conocimientoServ.verConocimiento();
   }
   
   @DeleteMapping ("/delete/conocimiento/{id}")
   public void borrarConocimiento (@PathVariable Long id){
       conocimientoServ.borrarConocimiento(id);
   }
   
   @PutMapping ("/edit/conocimiento")
   public void editarConocimiento (@RequestBody Conocimiento c){
   conocimientoServ.crearConocimiento(c);
   }
   
   @GetMapping ("/buscar/conocimiento/{id}")
   public Conocimiento buscarConocimiento(@PathVariable Long id){
     return conocimientoServ.buscarConocimiento(id);
   }
   
   /* ******************EXPERIENCIA************************* */
   
   @PostMapping ("/new/experiencia")
   public void crearExperiencia (@RequestBody Experiencia exp){
   experServ.crearExperiencia(exp);
   }
   
   @GetMapping ("/ver/experiencias")
   @ResponseBody
   public List<Experiencia> verExperiencia(){
       return experServ.verExperiencia();
   }
   
   @DeleteMapping ("/delete/experiencia/{id}")
   public void borrarExperiencia (@PathVariable Long id){
       experServ.borrarExperiencia(id);
   }
   
   @PutMapping ("/edit/experiencia")
   public void editarExperiencia (@RequestBody Experiencia exp){
   experServ.crearExperiencia(exp);
   }
   
   @GetMapping ("/buscar/experiencia/{id}")
   public Experiencia buscarExperiencia(@PathVariable Long id){
     return experServ.buscarExperiencia(id);
   }
   
   /**************************PROYECTOS******************************************************/
    @PostMapping ("/new/proyecto")
   public void crearProyecto (@RequestBody Proyecto pro){
   proyectoServ.crearProyecto(pro);
   }
   
   @GetMapping ("/ver/proyectos")
   @ResponseBody
   public List<Proyecto> verProyecto(){
       return proyectoServ.verProyecto();
   }
   
   @DeleteMapping ("/delete/proyecto/{id}")
   public void borrarProyecto(@PathVariable Long id){
       proyectoServ.borrarProyecto(id);
   }
   
   @PutMapping ("/edit/proyecto")
   public void editarProyecto(@RequestBody Proyecto pro){
   proyectoServ.crearProyecto(pro);
   }
   
   @GetMapping ("/buscar/proyecto/{id}")
   public Proyecto buscarProyecto(@PathVariable Long id){
     return proyectoServ.buscarProyecto(id);
   }
   
    
}
