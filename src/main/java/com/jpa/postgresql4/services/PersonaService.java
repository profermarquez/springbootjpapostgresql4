/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.services;

import com.jpa.postgresql4.models.Administrativo;
import com.jpa.postgresql4.models.AuxiliarCargaDescarga;
import com.jpa.postgresql4.models.Cliente;
import com.jpa.postgresql4.models.Gerente;
import com.jpa.postgresql4.models.Personas;
import com.jpa.postgresql4.models.Proveedor;
import com.jpa.postgresql4.models.Transportista;
import com.jpa.postgresql4.repository.AdministrativoRepository;
import com.jpa.postgresql4.repository.AuxiliarCargaDescargaRepository;
import com.jpa.postgresql4.repository.ClienteRepository;
import com.jpa.postgresql4.repository.GerenteRepository;
import com.jpa.postgresql4.repository.ProveedorRepository;
import com.jpa.postgresql4.repository.TransportistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sebastian
 */
@Service
public class PersonaService {
    private final TransportistaRepository tranRepositorio;
    private final ProveedorRepository proveedorRepositorio;
    private final GerenteRepository gerenteRepositorio;
    private final AuxiliarCargaDescargaRepository auxiliarRepositorio;
    private final AdministrativoRepository administrativoRepositorio;
    private final ClienteRepository clienteRepositorio;

    @Autowired
    PersonaService(TransportistaRepository transRepositorio, ProveedorRepository proveedorRepositorio, GerenteRepository gerenteRepositorio, AuxiliarCargaDescargaRepository auxiliarRepositorio, AdministrativoRepository administrativoRepositorio, ClienteRepository clienteRepositorio) {
        this.tranRepositorio = transRepositorio;
        this.proveedorRepositorio = proveedorRepositorio;
        this.gerenteRepositorio = gerenteRepositorio;
        this.auxiliarRepositorio = auxiliarRepositorio;
        this.administrativoRepositorio = administrativoRepositorio;
        this.clienteRepositorio = clienteRepositorio;
    }
    
    
    public Personas guardar(Personas per, int tipo)
        {
            //System.out.println("Llega personas service");
            Personas p=null;
            if(per==null){System.out.println("Error en guardar persona");return p;}
            if(tipo ==1)
                {Gerente g =new Gerente();g=(Gerente)per;this.gerenteRepositorio.save(g);return g;}
            if(tipo ==2)
                {System.out.println("transp"+per.getLogin().getEmail()+per.getLogin().getNombreRoll());Transportista t = new Transportista();t=(Transportista)per;this.tranRepositorio.save(t);return t;}
            if(tipo ==3)
                {System.out.println("provee"+per.getLogin().getEmail()+per.getLogin().getNombreRoll());Proveedor t = new Proveedor();t=(Proveedor)per;this.proveedorRepositorio.save(t);return t;}
            if(tipo ==4)
                {System.out.println("cliente"+per.getLogin().getEmail()+per.getLogin().getNombreRoll());Cliente t = new Cliente();t=(Cliente)per;this.clienteRepositorio.save(t);return t;}
            if(tipo ==5)
                {System.out.println("auxiliar "+per.getLogin().getEmail()+per.getLogin().getNombreRoll());AuxiliarCargaDescarga t = new AuxiliarCargaDescarga();t=(AuxiliarCargaDescarga)per;this.auxiliarRepositorio.save(t);return t;}
            if(tipo ==6)
                {System.out.println("administra"+per.getLogin().getEmail()+per.getLogin().getNombreRoll());Administrativo t = new Administrativo();t=(Administrativo)per;this.administrativoRepositorio.save(t);return t;}
            
            
            return p;
        }


}
    
    
    
    

