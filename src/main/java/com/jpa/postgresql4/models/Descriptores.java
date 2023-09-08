/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;


import jakarta.persistence.MappedSuperclass;
import java.util.Date;

/**
 *
 * @author Sebastian
 */

public abstract class Descriptores {
    public String descripcion;
    public Date fechayHora;
  
    
    public Descriptores(String descripcion, Date fechayHora) {
        this.descripcion = descripcion;
        this.fechayHora = fechayHora;
    }
    public Descriptores(){}

    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(Date fechayHora) {
        this.fechayHora = fechayHora;
    }
    
    
}
