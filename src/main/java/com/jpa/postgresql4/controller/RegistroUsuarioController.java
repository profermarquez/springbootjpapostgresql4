package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.dto.PersonaDto;
import com.jpa.postgresql4.models.Administrativo;
import com.jpa.postgresql4.models.AuxiliarCargaDescarga;
import com.jpa.postgresql4.models.Cliente;
import com.jpa.postgresql4.models.Gerente;
import com.jpa.postgresql4.models.Personas;
import com.jpa.postgresql4.models.Proveedor;
import com.jpa.postgresql4.models.Roll;
import com.jpa.postgresql4.models.Transportista;
import com.jpa.postgresql4.models.Usuario;
import com.jpa.postgresql4.services.PersonaService;
import com.jpa.postgresql4.services.UsuarioServicio;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario/registro")
public class RegistroUsuarioController {

        private final PersonaService personaServicio;
        
	public RegistroUsuarioController(UsuarioServicio usuarioServicio,PersonaService p) {
		super();
                this.personaServicio=p;
	}
	
	@ModelAttribute("personadto")
	public PersonaDto retornarNuevoUsuarioRegistroDTO() {
		return new PersonaDto();
	}

	@GetMapping
	public String mostrarFormularioDeRegistro(HttpServletRequest request) {
                //if (request.isUserInRole("GERENTE")) 
             //      {
              //              System.out.println("gerenteee");
                //        }
                //System.out.println(request.getUserPrincipal().getClass());
                //System.out.println(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
		return "/usuario/registro";
	}
	
	@PostMapping
	public String registrarCuentaDeUsuario(PersonaDto registro) 
        {
                int bandera =0;
		String rol = registro.getRoll();
                Personas p =null;
                Usuario u = new Usuario(registro.getEmail(),registro.getPassword(),new Roll("AUXILIAR"));
                if(rol.compareTo("administrativo")==0){u.getRol().setNombre(6);p= new Administrativo(registro.getNomyape(),registro.getDomicilio(),registro.getCuil(),registro.getTelefono1(),registro.getTelefono2(),u);bandera=6;}
                if(rol.compareTo("auxiliarcargaydescarga")==0){u.getRol().setNombre(5);p= new AuxiliarCargaDescarga(registro.getNomyape(),registro.getDomicilio(),registro.getCuil(),registro.getTelefono1(),registro.getTelefono2(),u);bandera=5;}
                if(rol.compareTo("cliente")==0){u.getRol().setNombre(4);p= new Cliente(registro.getNomyape(),registro.getDomicilio(),registro.getCuil(),registro.getTelefono1(),registro.getTelefono2(),u);bandera=4;}
                if(rol.compareTo("proveedor")==0){u.getRol().setNombre(3);p= new Proveedor(registro.getNomyape(),registro.getDomicilio(),registro.getCuil(),registro.getTelefono1(),registro.getTelefono2(),u);bandera=3;}
                if(rol.compareTo("transportista")==0){u.getRol().setNombre(2);p= new Transportista(registro.getNomyape(),registro.getDomicilio(),registro.getCuil(),registro.getTelefono1(),registro.getTelefono2(),u);bandera=2;}
                if(rol.compareTo("gerente")==0){u.getRol().setNombre(1);p= new Gerente(registro.getNomyape(),registro.getDomicilio(),registro.getCuil(),registro.getTelefono1(),registro.getTelefono2(),u);bandera=1;}
                
                if(u==null){System.out.println("Error en controller, usuario nulo.");return "redirect:/usuario/registro";}
                if(p==null){System.out.println("Error en controller, persona nula.");return "redirect:/usuario/registro";}
                //usuarioServicio.guardar(u,bandera);// 1= administrador otro valor es usuario
                personaServicio.guardar(p, bandera);
		return "redirect:/indexgerente";
	}
}
