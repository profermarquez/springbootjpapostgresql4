/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;


/**
 *
 * @author Sebastian
 */

@Entity
public class Transportista extends Personas{
    
    @OneToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto contrato
    public ArrayList<SolicitudReparto> repartos = new ArrayList<SolicitudReparto>();
    @OneToMany
    @JoinColumn(name = "per_id")//clave id de del objeto contrato
    public ArrayList<AuxiliarCargaDescarga> auxiliarCargaDescarga = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "des_id")//clave id de del objeto contrato
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

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }
    
}
