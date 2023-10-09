/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sebastian
 */

@Entity
public class Cliente extends Personas{
   
    @ManyToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto persona
    private List<Pedidos> pedidos= new ArrayList<>();
    
    @ManyToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto persona
    public List<RemitoEntrega> remitos = new ArrayList<>();
    
    @ManyToMany
    @JoinColumn(name = "mes_id")//clave id de del objeto persona
    public List<Mensaje> mensaje = new ArrayList<>();
    
    /* que tiene que cargar el cliente cuando se crea
        - mensajes
        - Remitos de entregas
        - Pedidos 
    
    */

    public Cliente() {
    }

    public Cliente(String nombreyApellido, String domicilio, String cuil, String telefono1, String telefono2, Usuario l) {
        super(nombreyApellido, domicilio, cuil, telefono1, telefono2, l);
    }
   
}
