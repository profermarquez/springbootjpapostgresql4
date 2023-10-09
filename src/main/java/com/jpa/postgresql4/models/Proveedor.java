/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
@Entity
public class Proveedor extends Personas{
   
    @ManyToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto contrato
    public List<OrdenDeCompra> contratos = new ArrayList<>();

    
    //new Proveedor("Sergio Correa", "sergioc",         "123456", "Av. Quaranta 123",      "sergiotop@gmail.com", "20319873454","3764-229191","3764-32486" )

    public Proveedor() {
    }

    public Proveedor(String nombreyApellido, String domicilio, String cuil, String telefono1, String telefono2, Usuario l) {
        super(nombreyApellido, domicilio,  cuil, telefono1, telefono2, l);
    }
    
    
    
}
