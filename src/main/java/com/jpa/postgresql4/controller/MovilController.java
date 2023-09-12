/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.models.Movil;
import com.jpa.postgresql4.repository.ManzanaRepository;
import com.jpa.postgresql4.repository.MovilRepository;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sebastian
 */
@Controller
public class MovilController {
    private final MovilRepository movilRepository;
    
    @Autowired
    public MovilController(MovilRepository movilRepository) {
        this.movilRepository = movilRepository;
    }
    
    @GetMapping("/movil/")
    public String viewHomePage(Model model) {
        //Movil m = new Movil(20, "Hyundai HD120",new Date(2022, 02, 11) );
        //this.movilRepository.save(m);
        
        model.addAttribute("moviles", movilRepository.findAll());
        return "movil/index";
    }
    
    
}
