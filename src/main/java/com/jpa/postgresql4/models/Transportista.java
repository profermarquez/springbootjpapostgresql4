/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.CascadeType;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;


/**
 *
 * @author Sebastian
 */


class Transportista extends Personas{
    
    
    public ArrayList<SolicitudReparto> repartos = new ArrayList<SolicitudReparto>();
    
    public ArrayList<AuxiliarCargaDescarga> auxiliarCargaDescarga = new ArrayList<>();
    
    
    public Movil movil;

    public Transportista(String nombreyApellido, String usuario, String contraseña, String domicilio, String correoElectronico, String cuil, String telefono2) {
        super(nombreyApellido, usuario, contraseña, domicilio, correoElectronico, cuil, telefono2);
    }

    

    

    public ArrayList<SolicitudReparto> getRepartos() {
        return repartos;
    }

    public void setRepartos(ArrayList<SolicitudReparto> repartos) {
        this.repartos = repartos;
    }

    public ArrayList<AuxiliarCargaDescarga> getAuxiliarCargaDescarga() {
        return auxiliarCargaDescarga;
    }

    public void setAuxiliarCargaDescarga(ArrayList<AuxiliarCargaDescarga> auxiliarCargaDescarga) {
        this.auxiliarCargaDescarga = auxiliarCargaDescarga;
    }

  
/*
    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }*/

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
