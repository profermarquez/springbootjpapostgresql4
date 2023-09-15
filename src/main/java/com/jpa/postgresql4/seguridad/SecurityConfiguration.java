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
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
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
        
       http.authorizeHttpRequests(requests -> requests
               .requestMatchers("/usuario/registro").hasAuthority("GERENTE")
               .requestMatchers("/index").permitAll()
               .requestMatchers("/logout").permitAll()
               .requestMatchers("/usuario/registro?exito").permitAll().anyRequest().authenticated())
               
               .formLogin(form -> form.loginPage("/login").permitAll()
               
            );
  /*  http.authorizeRequests()
            .requestMatchers("/").hasAnyAuthority(""); */
    
        return http.build();
    }
}

