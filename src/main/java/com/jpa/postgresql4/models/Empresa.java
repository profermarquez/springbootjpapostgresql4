/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

public class Empresa {
    
    private Long id;
    public String nombre;
   
    public Gerente gerente;
    
    public ArrayList<Almacenes> almacenes = new ArrayList<Almacenes>();
    
    public ArrayList<Administrativo> personalAdministrativo= new ArrayList<>();
    
   
    public ArrayList<Movil> moviles= new ArrayList<Movil>();
    
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
