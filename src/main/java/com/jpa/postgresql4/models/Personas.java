/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
@MappedSuperclass
public class Personas {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="persona_id")
    public String nombreyApellido;
    public String usuario;
    public String contraseña;
    public String domicilio;
    public String correoElectronico;
    public String cuil;
    public String telefono1;
    public String telefono2;
   
    public ArrayList<Contratos> contratos = new ArrayList<Contratos>();

   

    public Personas(String nombreyApellido, String usuario, String contraseña, String domicilio, String correoElectronico, String cuil, String telefono2) {
        this.nombreyApellido = nombreyApellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.domicilio = domicilio;
        this.correoElectronico = correoElectronico;
        this.cuil = cuil;
        this.telefono2 = telefono2;
    }

    public String getNombreyApellido() {
        return nombreyApellido;
    }

    

    public void setNombreyApellido(String nombreyApellido) {
        this.nombreyApellido = nombreyApellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public ArrayList<Contratos> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<Contratos> contratos) {
        this.contratos = contratos;
    }
    
    
    
    
    
    
}
