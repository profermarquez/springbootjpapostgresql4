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
                          return "/indexgerente";
                        }
		modelo.addAttribute("usuarios", servicio.listarUsuarios());
                
		return "/index";
	}
}
