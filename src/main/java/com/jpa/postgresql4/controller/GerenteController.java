/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.services.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sebastian
 */
@Controller
public class GerenteController {
    
    @Autowired
    private UsuarioServicio servicioUsuarios;
    
    
    
    @GetMapping("/gerente/usuarios")
    public String viewUsuariosPage(Model modelo) {
        modelo.addAttribute("usuarios", servicioUsuarios.listarUsuarios());
        return "/gerente/usuarios";
    }
    
    @GetMapping("/gerente/index")
    public String listadoUsuariosPage() {
        return "/gerente/index";
    }
    
}
