/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Entity;

/**
 *
 * @author Sebastian
 */
@Entity
public class Gerente extends Personas {

    public Gerente(String nombreyApellido, String domicilio, String cuil, String telefono1, String telefono2, Usuario us) {
        super(nombreyApellido, domicilio, cuil, telefono1, telefono2, us);
    }

    

    public Gerente() {
    }

}
