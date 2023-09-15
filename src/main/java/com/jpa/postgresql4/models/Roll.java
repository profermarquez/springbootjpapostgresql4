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
public class Roll {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="roll_id")
    private long roll_id;
    
    private String nombre;

    public Roll() {
        
            
        
    }
    
    

    public Roll( String nombre) {
        this.nombre = nombre;
    }

    public long getRoll_id() {
        return roll_id;
    }

    public void setRoll_id(long roll_id) {
        this.roll_id = roll_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(int tipo) {
        if(tipo ==1)
                {this.nombre="GERENTE";}
            if(tipo ==2)
                {this.nombre="TRANSPORTISTA";}  
            if(tipo ==3)
                {this.nombre="PROVEEDOR";}
            if(tipo ==4)
                {this.nombre="CLIENTE";}
            if(tipo ==5)
                {this.nombre="AUXILIAR";}
            if(tipo ==6)
                {this.nombre="ADMINISTRATIVO";}
    }
    
}
