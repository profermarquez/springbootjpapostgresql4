/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.seguridad;

/**
 *
 * @author Sebastian
 */
import com.jpa.postgresql4.services.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.HeaderWriterLogoutHandler;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends AbstractSecurityWebApplicationInitializer{

	@Autowired
	private UsuarioServicio usuarioServicio;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
                //System.out.println("Llega security");
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(usuarioServicio);
		auth.setPasswordEncoder(passwordEncoder());
                //System.out.println(auth.getUserCache().toString());
		return auth;
	}
   
    
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) 
            throws Exception {
       

        
       http.authorizeHttpRequests(requests -> 
               
       {
           requests.requestMatchers(HttpMethod.GET,"/login","/logout","/login**","/index**").permitAll();
           requests.requestMatchers(HttpMethod.GET,"/gerente/index","/usuario/registro","/usuario/usuarios").hasAuthority("ROLE_GERENTE");
           
           
           requests.requestMatchers(HttpMethod.GET,"/cliente/index","/cliente/index?continue").hasAuthority("ROLE_CLIENTE");
           requests.requestMatchers(HttpMethod.GET,"/cliente/pedidos","/cliente/pedidos**").hasAuthority("ROLE_CLIENTE");
           
           requests.requestMatchers(HttpMethod.GET,"/administrativo/index").hasAuthority("ROLE_GERENTE");
           requests.requestMatchers(HttpMethod.GET,"/transportista/index").hasAuthority("ROLE_GERENTE");
           requests.requestMatchers(HttpMethod.GET,"/proveedor/index").hasAuthority("ROLE_GERENTE");
           
           requests.anyRequest().authenticated();
       })
              .formLogin(login -> {
				login.loginPage("/login");
				login.defaultSuccessUrl("/");
				
				}
               
               );
        
        return http.build();
    }
}

