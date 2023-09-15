/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.services;

/**
 *
 * @author Sebastian
 */
import com.jpa.postgresql4.models.Roll;
import com.jpa.postgresql4.models.Usuario;
import com.jpa.postgresql4.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.security.core.userdetails.UserDetailsService;


interface UsuarioImp extends UserDetailsService{

	public Usuario guardar(Usuario registroDTO,int tipo);
	
	public List<Usuario> listarUsuarios();
        
        public List<Usuario> listarUsuariosNoAdmin();
	
}

@Service
public class UsuarioServicio implements UsuarioImp{
    
        @Autowired
	private UsuarioRepository usuarioRepositorio;
      
        @Autowired
	private BCryptPasswordEncoder passwordEncoder;
        
	public Usuario guardar(Usuario registroDTO, int tipo) {
            Usuario usuario = null;
            System.out.println("Registro guardar   " + registroDTO.getPassword());
            if(tipo ==1)
                {usuario = new Usuario(registroDTO.getEmail(),
		passwordEncoder.encode(registroDTO.getPassword()),new Roll("GERENTE"));}
            if(tipo ==2)
                {usuario = new Usuario(registroDTO.getEmail(),
		registroDTO.getPassword(),new Roll("TRANSPORTISTA"));}
            if(tipo ==3)
                {usuario = new Usuario(registroDTO.getEmail(),
		registroDTO.getPassword(),new Roll("PROVEEDOR"));}
            if(tipo ==4)
                {usuario = new Usuario(registroDTO.getEmail(),
		registroDTO.getPassword(),new Roll("CLIENTE"));}
            if(tipo ==5)
                {usuario = new Usuario(registroDTO.getEmail(),
		registroDTO.getPassword(),new Roll("AUXILIAR"));}
            if(tipo ==6)
                {usuario = new Usuario(registroDTO.getEmail(),
		registroDTO.getPassword(),new Roll("ADMINISTRATIVO"));}
		
            return usuarioRepositorio.save(usuario);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepositorio.findByEmail(username);
                System.out.println("security  "+username);
                
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario o password inválidos");
		}
		return new User(usuario.getEmail(),usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(String roles){
            System.out.println("rolees  "+roles);
            ArrayList<GrantedAuthority> roles2 = new ArrayList<GrantedAuthority>();
            SimpleGrantedAuthority role1 = new SimpleGrantedAuthority("GERENTE");
            
            roles2.add(role1);
            return roles2;
	}
	
        @Override
	public List<Usuario> listarUsuarios() {
		return usuarioRepositorio.findAll();
	}
        
        @Override
        public List<Usuario> listarUsuariosNoAdmin(){
            
            List<Usuario> list=usuarioRepositorio.findAll();
            for(Usuario str : list)
                    {
                        //imprimimos el objeto pivote
                        System.out.println(str.getNombreRoll());
                    }
            return list;
        }
}
