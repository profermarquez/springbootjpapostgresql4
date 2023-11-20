/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
@MappedSuperclass
public class Personas {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="persona_id")
    private long per_id;
    
    public String nombreyApellido;
    public String domicilio;
    public String cuil;
    public String telefono1;
    public String telefono2;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "usuario_id")//clave id de del objeto login
    public Usuario usuario = new Usuario();
    
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "doc_id")//clave id de del objeto contrato
    public List<Contratos> contratos = new ArrayList<>();

    public Personas() {
    }

    public Personas(String nombreyApellido, String domicilio, String cuil, String telefono1, String telefono2, Usuario l) {
        this.usuario=l;
        this.nombreyApellido = nombreyApellido;
        this.domicilio = domicilio;
        this.cuil = cuil;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }
    
    

    public String getNombreyApellido() {
        return nombreyApellido;
    }

    public long getId() {
        return per_id;
    }

    

    public void setNombreyApellido(String nombreyApellido) {
        this.nombreyApellido = nombreyApellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
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

    public List<Contratos> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contratos> contratos) {
        this.contratos = contratos;
    }

    public Usuario getLogin() {
        return usuario;
    }

    public void setLogin(Usuario login) {
        this.usuario = login;
    }

    
  public String getUsername() {
        return this.usuario.getEmail();
    }

    
    
    
    
    
    
    
}
