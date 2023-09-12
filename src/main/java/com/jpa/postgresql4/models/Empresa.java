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
import jakarta.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
@Entity
public class Empresa {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="empresa_id")
    private Long empres_id;
    
    public String nombre;
    
    @OneToOne()
    @JoinColumn(name = "persona_id")//clave id de del objeto persona
    public Gerente gerente;
    
    @ManyToMany
    @JoinColumn(name = "almacen_id")//clave id de del objeto persona
    public List<Almacenes> almacenes = new ArrayList<Almacenes>();
    
    @ManyToMany
    @JoinColumn(name = "persona_id")//clave id de del objeto persona
    public List<Administrativo> personalAdministrativo= new ArrayList<>();
    
    @ManyToMany
    @JoinColumn(name = "des_id")//clave id de del objeto persona
    public List<Movil> moviles= new ArrayList<Movil>();
    
    @ManyToMany
    @Column(name = "rutas_empresa", nullable = false)
    @JoinColumn(name = "empresa_id") //clave id de del objeto persona
    public List<Ruta> rutas= new ArrayList<Ruta>();
    
    @ManyToMany
    @JoinColumn(name = "manzana_id")//clave id de del objeto persona
    public List<Manzana> manzanas= new ArrayList<>();
    
    @ManyToMany
    @JoinColumn(name = "doc_id")//clave id de del objeto persona
    public ArrayList<OrdenDeCompra> pedidosAProveedores = new ArrayList<>();
     
    @ManyToMany
    @JoinColumn(name = "persona_id")//clave id de del objeto persona
    public ArrayList<Proveedor> proveedores = new ArrayList<>();
    
  
    /*  que hace al inicio... 
        - Cargar todos las manzanas
        - Cargar todas las rutas
        - Cargar los mobiles
        - Cargar Todos los administrativos
        - Cargar todos los almacenes 
        - Cargar al Gerente
        - Cargar los proveedores
        - Cargar los pedidos a proveedores
    /*
    TO DO
    
    verificarMensajesClientes(
    enviarMensajeCliente()
    crearPedidos()
    asignarRutaAPedido()
    asignarPedidoAlmacen()
    getTransportistas()
    getSolicitudesRepartoTransportistas()
    getClientes()
    getPedidosPorCliente()
    getRemitoEntregasClientes()
    getAdministrativo()
    crearAlmacenes()
    buscarPedidoConCodigosDeBarras()
    gerenarOrdenCompraProveedores()
    recibirOrdenCompraProveedores()
    getCalificacionesProveedores()
    getPedidosFavoritosClientes()
    getCalificacionesEntregasDeClientes()
    */
    
    
}
