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
import jakarta.persistence.OneToMany;
import java.util.ArrayList;

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
    
    @OneToMany
    @JoinColumn(name = "per_id")//clave id de del objeto persona
    public ArrayList<Administrativo> personalAdministrativo = new ArrayList<>();   
    @OneToMany
    @JoinColumn(name = "des_id")//clave id de del objeto persona
    public ArrayList<Movil> moviles = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto persona
    public ArrayList<OrdenDeCompra> pedidosAProveedores = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto persona
    public ArrayList<Pedidos> inventarioPedidos = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto persona
    public ArrayList<SolicitudReparto> repartos = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "man_id")//clave id de del objeto persona
    public ArrayList<Manzana> manzanas = new ArrayList<>();
    
    @OneToMany
    @JoinColumn(name = "pedido_id")//clave id de del objeto persona
    public ArrayList<Pedidos> getPedidos()
    { return this.inventarioPedidos;}
    
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
