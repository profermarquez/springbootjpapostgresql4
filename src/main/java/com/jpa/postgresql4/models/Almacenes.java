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
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */

public class Almacenes {
   
    private Long id;
    
    public ArrayList<Administrativo> personalAdministrativo = new ArrayList<>();   
    
    public ArrayList<Movil> moviles = new ArrayList<>();
    
    @OneToMany(cascade =CascadeType.ALL)
    @JoinColumn(name="fk_ordenes_id",referencedColumnName="almacenes_id")
    public ArrayList<OrdenDeCompra> pedidosAProveedores = new ArrayList<>();
    @OneToMany(cascade =CascadeType.ALL)
    @JoinColumn(name="fk_pedidos_id",referencedColumnName="almacenes_id")
    public ArrayList<Pedidos> inventarioPedidos = new ArrayList<>();
    @OneToMany(cascade =CascadeType.ALL)
    @JoinColumn(name="fk_solicitudes_id",referencedColumnName="almacenes_id")
    public ArrayList<SolicitudReparto> repartos = new ArrayList<>();
    @OneToMany(cascade =CascadeType.ALL)
    @JoinColumn(name="fk_manzanas_id",referencedColumnName="almacenes_id")
    public ArrayList<Manzana> manzanas = new ArrayList<>();
    
    
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
