/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.services;

/**
 *
 * @author Sebastian
 */
import com.jpa.postgresql4.models.Cliente;
import com.jpa.postgresql4.models.Personas;
import com.jpa.postgresql4.models.Roll;
import com.jpa.postgresql4.models.Usuario;
import com.jpa.postgresql4.repository.ClienteRepository;
import com.jpa.postgresql4.repository.GerenteRepository;
import com.jpa.postgresql4.repository.UsuarioRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;


interface UsuarioImp extends UserDetailsService{

	public Usuario guardar(Usuario registroDTO,int tipo);
	
	public List<Usuario> listarUsuarios();
        public String listarUsuarios2();
        public Personas getPersonaCliente(String email);
        
        public List<Usuario> listarUsuariosNoAdmin();
	
}

@Service
public class UsuarioServicio implements UsuarioImp{
    
        SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
    
        @Autowired
	private UsuarioRepository usuarioRepositorio;
        @Autowired
        private GerenteRepository gerenteRepository;
        @Autowired
        private ClienteRepository clienteRepository;
      
        @Autowired
	private BCryptPasswordEncoder passwordEncoder;
        
        @Override
        public Cliente getPersonaCliente(String email)
        {
            Usuario usr =this.usuarioRepositorio.findByEmail(email);
            System.out.println(usr.getEmail());
            Cliente cliente = clienteRepository.findByUsuario(usr);
            return cliente;
            
        }
        
	public Usuario guardar(Usuario registroDTO, int tipo) {
            Usuario usuario = null;
            //System.out.println("Registro guardar   " + registroDTO.getPassword());
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
                
                
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario o password inválidos");
		}
                ArrayList<GrantedAuthority> r = new ArrayList<>(); r.add(mapearAutoridadesRoles(usuario.getRoles()));
		return new User(usuario.getEmail(),usuario.getPassword(), r);
	}

	//private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(String roles){
        private GrantedAuthority mapearAutoridadesRoles(String role){
            //System.out.println("ingreso role "+role);
            SimpleGrantedAuthority role1 =null;
            if(role.compareTo("AUXILIAR")==0){
             role1 = new SimpleGrantedAuthority("ROLE_TRANSPORTISTA");}
            if(role.compareTo("TRANSPORTISTA")==0){
             role1 = new SimpleGrantedAuthority("ROLE_TRANSPORTISTA");
            }if(role.compareTo("CLIENTE")==0){
             role1 = new SimpleGrantedAuthority("ROLE_CLIENTE");
            }if(role.compareTo("PROVEEDOR")==0){
             role1 = new SimpleGrantedAuthority("ROLE_PROVEEDOR");
            }if(role.compareTo("ADMINISTRATIVO")==0){
             role1 = new SimpleGrantedAuthority("ROLE_ADMINISTRATIVO");
            }if(role.compareTo("GERENTE")==0){
             role1 = new SimpleGrantedAuthority("ROLE_GERENTE");}
            
            if(role1==null){System.out.println(role1+" null role");}
            return role1;
	}
	
        @Override
	public List<Usuario> listarUsuarios() {
            
		return usuarioRepositorio.findAll();
	}
        
        @Override
	public String listarUsuarios2() {
            
		return "Sebastian";
	}
        
        @Override
        public List<Usuario> listarUsuariosNoAdmin(){
            
            List<Usuario> list=usuarioRepositorio.findAll();
            for(Usuario str : list)
                    {
                        //imprimimos el objeto pivote
                        System.out.println("nombre roll"+str.getNombreRoll());
                    }
            return list;
        }

    public void Logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        this.logoutHandler.logout(request, response, authentication);
    }
}
