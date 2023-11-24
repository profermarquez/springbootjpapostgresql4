/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.seguridad;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Sebastian
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer{
    
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        
                registry.addViewController("/usuario/registro").setViewName("/usuario/registro");
                //registry.addViewController("/?continue").setViewName("/");
		registry.addViewController("/gerente/index").setViewName("/gerente/index");
                registry.addViewController("/gerente/usuarios").setViewName("/gerente/usuarios");
                
                registry.addViewController("/cliente/index").setViewName("/cliente/index");
                registry.addViewController("/cliente/realizarpedido").setViewName("/cliente/realizarpedido");
                registry.addViewController("/administrativo/index").setViewName("/administrativo/index");
                registry.addViewController("/transportista/index").setViewName("/transportista/index");
                registry.addViewController("/proveedor/index").setViewName("/proveedor/index");
		registry.addViewController("/login").setViewName("/login");
		registry.addViewController("/logout").setViewName("/logout");
		//registry.addViewController("/usuario/registro?exito").setViewName("/usuario/registro?exito");
                //registry.addViewController("/?continue").setViewName("/?continue");
		//registry.addViewController("/login").setViewName("login");
                
		
	}
    
}
