package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.models.Cliente;
import com.jpa.postgresql4.models.Movil;
import com.jpa.postgresql4.services.UsuarioServicio;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegistroController {

	@Autowired
	private UsuarioServicio servicioUsuarios;

        @GetMapping("/logout")
	public String cerrarSesion(Authentication authentication, HttpServletRequest request, HttpServletResponse response) {
            this.servicioUsuarios.Logout(request, response, authentication);
            return "/login";
	}

	@GetMapping("/")
	public String verPaginaDeInicio(HttpServletRequest request,Model modelo,RedirectAttributes redirectAttributes) {
            
            
            String username=request.getUserPrincipal().getName();
            
            if (request.isUserInRole("GERENTE")) 
                   {
                      
                       return "redirect:/gerente/index";
                    }
            if (request.isUserInRole("ADMINISTRATIVO")) 
                   {
                       return "redirect:/administrativo/index";
                    }
            if (request.isUserInRole("PROVEEDOR")) 
                   {
                       return "redirect:/proveedor/index";
                    }
            if (request.isUserInRole("CLIENTE")) 
                   {
                       Cliente cliente = this.servicioUsuarios.getPersonaCliente(username);
                       redirectAttributes.addFlashAttribute("cliente", cliente);
                       return "redirect:/cliente/index";
                    }
            if (request.isUserInRole("TRANSPORTISTA")) 
                   {
                       return "redirect:/transportista/index";
                    }
            if (request.isUserInRole("AUXILIAR")) 
                   {
                       return "redirect:/transportista/index";
                    }
		return "redirect:/";
	}
   

}
