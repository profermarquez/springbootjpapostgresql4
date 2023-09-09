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
import java.util.ArrayList;
import java.util.List;


@Entity
public class Manzana {
   
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="manzana_id")
    private Long man_id;
    //@Column(name = "nombre")
    public String nombre;
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
    public List<String> callesInternas = new ArrayList<>();
    
    public int latitudCentroManzana;
    
    public int longitudCentroManzana;

    

    public List<String> getCallesInternas() {
        return callesInternas;
    }


    public void setCallesInternas(List<String> callesInternas) {
        this.callesInternas = callesInternas;
    }
    
    public boolean compareTo(Manzana m)
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

    public int getLatitudCentroManzana() {
        return latitudCentroManzana;
    }

    public void setLatitudCentroManzana(int latitudCentroManzana) {
        this.latitudCentroManzana = latitudCentroManzana;
    }

    public int getLongitudCentroManzana() {
        return longitudCentroManzana;
    }

    public void setLongitudCentroManzana(int longitudCentroManzana) {
        this.longitudCentroManzana = longitudCentroManzana;
    }
    
}
