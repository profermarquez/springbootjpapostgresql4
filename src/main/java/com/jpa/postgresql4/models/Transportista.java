/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sebastian
 */

@Entity
public class Transportista extends Personas{
    
    @ManyToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto contrato
    public List<SolicitudReparto> repartos = new ArrayList<SolicitudReparto>();
    
    @ManyToMany
    @JoinColumn(name = "per_id")//clave id de del objeto contrato
    public List<AuxiliarCargaDescarga> auxiliarCargaDescarga = new ArrayList<>();
    
    @OneToOne
    @JoinColumn(name = "des_id")//clave id de del objeto contrato
    public Movil movil;

    public Transportista(Movil movil, String nombreyApellido, String domicilio, String cuil, String telefono1, String telefono2, Usuario l) {
        super(nombreyApellido, domicilio,  cuil, telefono1, telefono2, l);
        this.movil = movil;
    }
    public Transportista( String nombreyApellido, String domicilio, String cuil, String telefono1, String telefono2, Usuario l) {
        super(nombreyApellido, domicilio,  cuil, telefono1, telefono2, l);
        
    }

    public Transportista() {
        
    }

    public void setRepartos(ArrayList<SolicitudReparto> repartos) {
        this.repartos = repartos;
    }

   

    public void setAuxiliarCargaDescarga(ArrayList<AuxiliarCargaDescarga> auxiliarCargaDescarga) {
        this.auxiliarCargaDescarga = auxiliarCargaDescarga;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }
    
}
