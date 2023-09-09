/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Sebastian
 */


@Entity
public class Gerente extends Personas{
    
    public Gerente(String nombreyApellido, String usuario, String contraseña, String domicilio, String correoElectronico, String cuil, String telefono2) {
        super(nombreyApellido, usuario, contraseña, domicilio, correoElectronico, cuil, telefono2);
    }
    
}
