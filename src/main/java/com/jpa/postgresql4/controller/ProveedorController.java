/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.models.Proveedor;
import com.jpa.postgresql4.repository.ProveedorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sebastian
 */
@Controller
public class ProveedorController {
    private final ProveedorRepository proveedorRepository;

    public ProveedorController(ProveedorRepository proveedorRespository) {
        this.proveedorRepository  = proveedorRespository;
    }
    
    @GetMapping("/proveedor/")
    public String viewHomePage(Model model) {
    
    //Proveedor p = new Proveedor("Sergio Correa", "sergioc",         "123456", "Av. Quaranta 123",      "sergiotop@gmail.com", "20319873454","3764-229191","3764-32486" );
    //proveedorRepository.save(p);
    model.addAttribute("proveedores", proveedorRepository.findAll());
        return "proveedor/index";
    }
    
    
    
}
