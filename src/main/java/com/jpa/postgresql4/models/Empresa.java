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
import jakarta.persistence.OneToOne;
import java.util.ArrayList;

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
    @OneToMany
    @JoinColumn(name = "almacen_id")//clave id de del objeto persona
    public ArrayList<Almacenes> almacenes = new ArrayList<Almacenes>();
    @OneToMany
    @JoinColumn(name = "persona_id")//clave id de del objeto persona
    public ArrayList<Administrativo> personalAdministrativo= new ArrayList<>();
    
    @OneToMany
    @JoinColumn(name = "des_id")//clave id de del objeto persona
    public ArrayList<Movil> moviles= new ArrayList<Movil>();
    @OneToMany
    @JoinColumn(name = "ruta_id")//clave id de del objeto persona
    public ArrayList<Ruta> rutas= new ArrayList<>();
    
  
    
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
