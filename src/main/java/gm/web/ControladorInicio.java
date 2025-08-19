/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gm.web;

import gm.modelo.Persona;
import gm.servicio.PersonaService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author herra
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user) {
        log.info(" -- Ejecutando el controlador Spring MVC -- ");
        log.info("Usuario que hizo login: " + user);
                
        var personas = personaService.listarPersonas();
        model.addAttribute("personas", personas);
        
        var saldoTotal = 0D;
        for(var p: personas){
            saldoTotal += p.getSaldo();
        }
        model.addAttribute("saldoTotal",saldoTotal);
        model.addAttribute("totalClientes", personas.size());
        
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores, Model model) {
        if(errores.hasErrors()){
            log.warn("Errores de validación: " + errores.getAllErrors()) ;
            return "modificar";
        }
        
        personaService.guardar(persona);
        log.info("Persona guardada: "+ persona) ;
        return "redirect:/"; 
    }

    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model) {
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar/{idPersona}")
    public String eliminar(Persona persona) {
        persona = personaService.encontrarPersona(persona);
        personaService.eliminar(persona);
        return "redirect:/";
    }

}
