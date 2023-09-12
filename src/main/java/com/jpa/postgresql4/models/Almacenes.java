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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
@Entity
public class Almacenes {
   
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="almacen_id")
    private Long almacen_id;
    
    @ManyToMany
    @JoinColumn(name = "mes_id")//clave id de del objeto persona
    public List<Mensaje> mensaje = new ArrayList<>();
    
    @ManyToMany
    @JoinColumn(name = "per_id")//clave id de del objeto persona
    public List<Administrativo> personalAdministrativo = new ArrayList<>(); 
    
    @ManyToMany
    @JoinColumn(name = "des_id")//clave id de del objeto persona
    public List<Movil> moviles = new ArrayList<>();
    
    @ManyToMany
    @JoinColumn(name = "persona_id")//clave id de del objeto persona
    public List<Transportista> transportistas= new ArrayList<>();
    
    @ManyToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto persona
    public List<Pedidos> inventarioPedidos = new ArrayList<>();
    
    @ManyToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto persona
    public List<SolicitudReparto> repartos = new ArrayList<>();
    
    @ManyToMany
    @JoinColumn(name = "manzana_id")//clave id de del objeto persona
    public List<Manzana> manzanas = new ArrayList<>();
    
    
  
    /*Que tiene que cargar
    
        - Cargar Personal administrativo
        - Cargar Moviles
        - Cargar los pedidos
        - Cargar las solicitudes de reparto
        - Cargar los mensajes
        - Cargar los transportistas
        - Cargar las manzanas
    
    */
    /*
    TODO
    revisarPedidosDiarios()
    getTransportistas()
    asignarPedidosTransportista()
    asignarMovilTransportista()
    crearSolicitudEntrega()
    asignarAuxiliarTrasportistas()
    
    */
    
}
