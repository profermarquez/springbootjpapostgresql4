/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Entity;
import java.util.Date;

/**
 *
 * @author Sebastian
 */
@Entity
public class Movil extends Descriptores {
   
    public int capacidadpaquetes;

    public int getCapacidadpaquetes() {
        return capacidadpaquetes;
    }

    public Movil() {
    }

    
    public void setCapacidadpaquetes(int capacidadpaquetes) {
        this.capacidadpaquetes = capacidadpaquetes;
    }
    

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getModeloMovil() {
        return fechayHora.getYear();
    }

    public void setModeloMovil(Date fechayHora) {
        this.fechayHora = fechayHora;
    }
    
    public Movil(int capacidadpaquetes, String descripcion, Date fechayHora) {
        super(descripcion, fechayHora);
        this.capacidadpaquetes = capacidadpaquetes;
    }

    public Movil(int capacidadpaquetes) {
        this.capacidadpaquetes = capacidadpaquetes;
    }
}
