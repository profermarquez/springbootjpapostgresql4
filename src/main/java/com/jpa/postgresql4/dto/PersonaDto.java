/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.dto;

/**
 *
 * @author Sebastian
 */
public class PersonaDto {
    public String nomyape;
    public String domicilio;
    public String cuil;
    public String telefono1;
    public String telefono2;
    private String email;
    private String password;
    private String roll;

    public PersonaDto(String nombreyApellido, String domicilio, String cuil, String telefono1, String telefono2, String email, String password, String roll) {
        this.nomyape = nombreyApellido;
        this.domicilio = domicilio;
        this.cuil = cuil;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.email = email;
        this.password = password;
        this.roll = roll;
    }

    public PersonaDto() {
        
    }

    public String getNomyape() {
        return nomyape;
    }

    public void setNomyape(String nomyape) {
        this.nomyape = nomyape;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
    
    
    
}
