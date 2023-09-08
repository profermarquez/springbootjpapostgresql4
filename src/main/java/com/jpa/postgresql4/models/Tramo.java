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
import jakarta.persistence.OneToOne;
import java.util.List;


/**
 *
 * @author Sebastian
 */

public class Tramo {
    
    
    private Long id;

    public String tipoTerreno;//tierra, asfalto, empedrado, mixto
    public int duracion;
    
    
    public List<Instruccion> instruciones;

  
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_ma_origen")
    public Manzana origen;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_ma_destino")
    public Manzana destino;

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    

    public Manzana getOrigen() {
        return origen;
    }

    public void setOrigen(Manzana origen) {
        this.origen = origen;
    }

    public Manzana getDestino() {
        return destino;
    }

    public void setDestino(Manzana destino) {
        this.destino = destino;
    }
    
    
}
