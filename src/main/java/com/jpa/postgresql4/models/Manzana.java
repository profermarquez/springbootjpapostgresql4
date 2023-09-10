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
import java.util.ArrayList;
import java.util.List;


@Entity
public class Manzana {
   
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="manzana_id")
    private Long man_id;
    //@Column(name = "nombre")
    public String nombre;//codigo solamente, contiguo para comprovar si son manzanas contiguas
    //@Column(name = "limite_uno")
    public String limiteavcalle1;
    //@Column(name = "limite_dos")
    public String limiteavcalle2;
    //@Column(name = "limite_tres")
    public String limiteavcalle3;
    //@Column(name = "limite_cuatro")
    public String limiteavcalle4;
    
    @ElementCollection
    @Column(name = "calles_internas", nullable = false)
    @JoinColumn(name = "man_id")
    public List<String> callesInternas = new ArrayList<>();
    
    public double latitudCentroManzana;
    
    public double longitudCentroManzana;
    //ArrayList<String> lista1 = new ArrayList<String>();     lista1.add("El Obrero");    lista1.add("Av Almafuerte");      lista1.add("Esperanza"); lista1.add("La Flor");    lista1.add("Esperanza");      lista1.add("Av Malvinas");
    //new Manzana("184","Av Aguado","Rio Paraná","Av Gregorio Las Heras", "Av José de Urquiza", -27.35646612762969, -55.916853316224156, lista1)
     
    //ArrayList<String> lista1 = new ArrayList<String>();     lista1.add("c.120");    lista1.add("c.122");      lista1.add("c.124"); lista1.add("Semilla");    lista1.add("c.105");      lista1.add("c.103");
    //new Manzana("235","Av Santa Cruz","Av Zapiola","Av Aguado", "Av Quaranta", -27.39953272089911, -55.93050906474097, lista1)
    
    public Manzana(String nombre, String limiteavcalle1, String limiteavcalle2, String limiteavcalle3, String limiteavcalle4, double latitudCentroManzana, double longitudCentroManzana,ArrayList ci) {
        this.nombre = nombre;
        this.limiteavcalle1 = limiteavcalle1;
        this.limiteavcalle2 = limiteavcalle2;
        this.limiteavcalle3 = limiteavcalle3;
        this.limiteavcalle4 = limiteavcalle4;
        this.latitudCentroManzana = latitudCentroManzana;
        this.longitudCentroManzana = longitudCentroManzana;
        this.callesInternas = ci;
    }

    public Manzana() {
    }

    

    public List<String> getCallesInternas() {
        return callesInternas;
    }


    public void setCallesInternas(List<String> callesInternas) {
        this.callesInternas = callesInternas;
    }
    
    public boolean compareTo(Manzana m)
    {//TO DO
        return true;}
    
    public boolean esManzanaContigua(Manzana m)
    {//TO DO
        return true;}
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLimiteavcalle1() {
        return limiteavcalle1;
    }

    public void setLimiteavcalle1(String limiteavcalle1) {
        this.limiteavcalle1 = limiteavcalle1;
    }

    public String getLimiteavcalle2() {
        return limiteavcalle2;
    }

    public void setLimiteavcalle2(String limiteavcalle2) {
        this.limiteavcalle2 = limiteavcalle2;
    }

    public String getLimiteavcalle3() {
        return limiteavcalle3;
    }

    public void setLimiteavcalle3(String limiteavcalle3) {
        this.limiteavcalle3 = limiteavcalle3;
    }

    public String getLimiteavcalle4() {
        return limiteavcalle4;
    }

    public void setLimiteavcalle4(String limiteavcalle4) {
        this.limiteavcalle4 = limiteavcalle4;
    }

    public double getLatitudCentroManzana() {
        return latitudCentroManzana;
    }

    public void setLatitudCentroManzana(int latitudCentroManzana) {
        this.latitudCentroManzana = latitudCentroManzana;
    }

    public double getLongitudCentroManzana() {
        return longitudCentroManzana;
    }

    public void setLongitudCentroManzana(int longitudCentroManzana) {
        this.longitudCentroManzana = longitudCentroManzana;
    }
    
}
