/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
@Entity
public class Ruta {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="ruta_id")
    private Long ruta_id;
    public String nombre;
    @OneToMany
    @JoinColumn(name = "tramo_id")//clave id de del objeto contrato
    public ArrayList<Tramo> tramos = new ArrayList<>();

    public Ruta() {
    }
    
    public int getDuracionRuta()
    {// TO DO
        return 1;}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tramo> getTramos() {
        return tramos;
    }

    public void setTramos(ArrayList<Tramo> tramos) {
        this.tramos = tramos;
    }
    
    
}
