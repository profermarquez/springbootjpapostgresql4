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
public class AuxiliarCargaDescarga extends Personas{
    
    @ManyToMany
    @JoinColumn(name = "doc_id",nullable = true)//clave id de del objeto persona
    public List<SolicitudReparto> repartos; 

    public AuxiliarCargaDescarga() {
    }

    
    public AuxiliarCargaDescarga(String nombreyApellido, String domicilio, String cuil, String telefono1, String telefono2, Usuario l) {
        super(nombreyApellido, domicilio,  cuil, telefono1, telefono2, l);
        this.repartos = new ArrayList<SolicitudReparto>();
        
    }

   

    
    
    
}
