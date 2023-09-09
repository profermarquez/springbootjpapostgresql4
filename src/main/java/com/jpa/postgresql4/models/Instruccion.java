/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



/**
 *
 * @author Sebastian
 */

@Entity
public class Instruccion {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="ins_id")
    private Long ins_id;
    
    private Long instruction_id;
    public String nroInstruccion;
    public String instruccion;
    public String calleAvenidaRuta;
    
    public Instruccion(String nroInstruccion, String instruccion) {
        this.nroInstruccion = nroInstruccion;
        this.instruccion = instruccion;
    }

    public String getNroInstruccion() {
        return nroInstruccion;
    }

    public void setNroInstruccion(String nroInstruccion) {
        this.nroInstruccion = nroInstruccion;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    
    
    
    
}
