/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.models.Manzana;
import com.jpa.postgresql4.repository.ManzanaRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sebastian
 */
@Controller
public class ManzanaController {
    private final ManzanaRepository manzanaRepository;
    
    @Autowired
    public ManzanaController(ManzanaRepository manzanaRepository) {
        this.manzanaRepository = manzanaRepository;
    }
    
    @GetMapping("/manzanas/")
    public String viewHomePage(Model model) {
        //ArrayList<String> lista1 = new ArrayList<String>();     lista1.add("El Obrero");    lista1.add("Av Almafuerte");      lista1.add("Esperanza"); lista1.add("La Flor");    lista1.add("Esperanza");      lista1.add("Av Malvinas");
        //Manzana m = new Manzana("184","Av Aguado","Rio Paraná","Av Gregorio Las Heras", "Av José de Urquiza", -27.35646612762969, -55.916853316224156, lista1);
        //ArrayList<String> lista1 = new ArrayList<String>();     lista1.add("c.120");    lista1.add("c.122");      lista1.add("c.124"); lista1.add("Semilla");    lista1.add("c.105");      lista1.add("c.103");
    //Manzana m =new Manzana("235","Av Santa Cruz","Av Zapiola","Av Aguado", "Av Quaranta", -27.39953272089911, -55.93050906474097, lista1);
    
      //   manzanaRepository.save(m);
        model.addAttribute("manzanas", manzanaRepository.findAll());
        return "manzana/index";
    }
    
    
    
}
