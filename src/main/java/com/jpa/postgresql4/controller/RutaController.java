/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.models.Manzana;
import com.jpa.postgresql4.models.Ruta;
import com.jpa.postgresql4.repository.ManzanaRepository;
import com.jpa.postgresql4.repository.RutaRepository;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sebastian
 */
@Controller
public class RutaController {
    private final RutaRepository rutaRepository;
    private final ManzanaRepository manzanaRepository;
    
    @Autowired
    public RutaController(RutaRepository rutaRepository,ManzanaRepository manzanaRepository) {
        this.rutaRepository = rutaRepository;
        this.manzanaRepository =manzanaRepository;
    }
    
    @GetMapping("/ruta/")
    public String viewHomePage(Model model1, Model model2) {
        /*ArrayList<String> lista1 = new ArrayList<String>();     lista1.add("El Obrero");    lista1.add("Av Almafuerte");      lista1.add("Esperanza"); lista1.add("La Flor");    lista1.add("Esperanza");      lista1.add("Av Malvinas");
        Manzana m1 = new Manzana("184","Av Aguado","Rio Paraná","Av Gregorio Las Heras", "Av José de Urquiza", -27.35646612762969, -55.916853316224156, lista1);
        ArrayList<String> lista2 = new ArrayList<String>();     lista2.add("c.120");    lista2.add("c.122");      lista2.add("c.124"); lista2.add("Semilla");    lista2.add("c.105");      lista2.add("c.103");
        Manzana m2 =new Manzana("235","Av Santa Cruz","Av Zapiola","Av Aguado", "Av Quaranta", -27.39953272089911, -55.93050906474097, lista2);
        this.manzanaRepository.save(m1);
        this.manzanaRepository.save(m2);
        
        ArrayList<String> lista3 = new ArrayList<String>();     lista3.add("Fracran");    lista3.add("Av Gregorio Las Heras");      lista3.add("Av Chacabucho"); lista3.add("Av Aguado");   
        Manzana m3= this.manzanaRepository.findByNombre("184");
    
        
        this.rutaRepository.save(r);
        rutaRepository.save(r);
        Ruta r = new Ruta( m1, m2, 2,0 ,"ruta 1", lista3);*/
        HashMap <Model, Model> map = new HashMap();
        model1.addAttribute("rutas", rutaRepository.findAll());
        map.put(model1, model1);
        model2.addAttribute("manzanas", manzanaRepository.findAll());
        map.put(model2, model2);
        
        return "ruta/index";
    }
    
    
    
}
