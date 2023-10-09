package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.services.UsuarioServicio;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroController {

	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "/login";
	}
        @GetMapping("/logout")
	public String cerrarSesion() {
		return "/login";
	}

	@GetMapping("/")
	public String verPaginaDeInicio(HttpServletRequest request,Model modelo) {
            
            if (request.isUserInRole("GERENTE")) 
                   {
                       modelo.addAttribute("usuarios", servicio.listarUsuarios());
                       return "/indexgerente";
                    }
            if (request.isUserInRole("ADMINISTRATIVO")) 
                   {
                       return "/administrativo/index";
                    }
            if (request.isUserInRole("PROVEEDOR")) 
                   {
                       return "/proveedor/index";
                    }
            if (request.isUserInRole("CLIENTE")) 
                   {
                       return "/cliente/index";
                    }
            if (request.isUserInRole("TRANSPORTISTA")) 
                   {
                       return "/transportista/index";
                    }
            if (request.isUserInRole("AUXILIAR")) 
                   {
                       return "/transportista/index";
                    }
		
                
		return "/index";
	}
}
