/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.models.Administrativo;
import com.jpa.postgresql4.repository.AdministrativoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sebastian
 */
@Controller
public class AdministrativoController {
    private final AdministrativoRepository adminRepo;

    @Autowired
    public AdministrativoController(AdministrativoRepository adminRepo) {
        this.adminRepo = adminRepo;
    }
    
    @GetMapping("/administrativo/")
    public String viewHomePage(Model model) {
    
      //Administrativo t = new Administrativo("Vanessa Viel", "vanessav",         "445556", "Pomar 129",      "vaneviel@gmail.com", "20395768329","3764-666432","3764-654241" );
      //adminRepo.save(t);
      
    model.addAttribute("adminsitrativos", adminRepo.findAll());
        return "administrativo/index";
    }
    
    
    
}
