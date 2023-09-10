/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

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
    
    @OneToOne()
    @JoinColumn(name = "manzana_destino_id")//clave id de del objeto manzana
    private Manzana manzanaOrigen;
    
    @OneToOne()
    @JoinColumn(name = "manzana_origen_id")//clave id de del objeto manzana
    private Manzana manzanaDestino;
    
    private int duracion; //horas
    private int tipo;// 0=ruta comun   1=ruta entre almacenes     3=ruta entre almacenes y proveedores
    
    public String nombre;
    
    @ElementCollection
    @Column(name = "calles_avenidas_ruta", nullable = false)
    @JoinColumn(name = "ruta_id")//clave id de del objeto contrato
    public List<String> calles_avenidas_ruta = new ArrayList<>();

    public Ruta() {
    }
    
//new Ruta( m1, m2, 2,0 ,"ruta 1")

    public Ruta( Manzana manzanaOrigen, Manzana manzanaDestino, int duracion, int tipo, String nombre, ArrayList r) {
        
        this.manzanaOrigen = manzanaOrigen;
        this.manzanaDestino = manzanaDestino;
        this.duracion = duracion;
        this.tipo = tipo;
        this.nombre = nombre;
        this.calles_avenidas_ruta=r;
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

    

    
    
    
}
