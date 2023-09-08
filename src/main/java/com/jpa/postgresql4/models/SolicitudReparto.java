/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;


import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.util.Date;

/**
 *
 * @author Sebastian
 */

public class SolicitudReparto extends Documentos{
    
    
    
    public Transportista transp;
    
    public String direccion;
    
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="fk_manzana_id")
    public Manzana manzana;
    public int codigoReparto;
    public boolean entregado;

    public SolicitudReparto() {
    }

   

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Manzana getManzana() {
        return manzana;
    }

    public void setManzana(Manzana manzana) {
        this.manzana = manzana;
    }

    public int getCodigoReparto() {
        return codigoReparto;
    }

    public void setCodigoReparto(int codigoReparto) {
        this.codigoReparto = codigoReparto;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcionDocumento() {
        return descripcionDocumento;
    }

    public void setDescripcionDocumento(String descripcionDocumento) {
        this.descripcionDocumento = descripcionDocumento;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    

    
    
}
