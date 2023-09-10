/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
@Entity
public class Proveedor extends Personas{
   
    @ManyToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto contrato
    public ArrayList<OrdenDeCompra> contratos = new ArrayList<>();

    public Proveedor(String nombreyApellido, String usuario, String contraseña, String domicilio, String correoElectronico, String cuil, String telefono2) {
        super(nombreyApellido, usuario, contraseña, domicilio, correoElectronico, cuil, telefono2);
    }
    
    
}
