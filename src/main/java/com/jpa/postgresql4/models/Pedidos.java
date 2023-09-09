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
import java.util.Date;

/**
 *
 * @author Sebastian
 */
@Entity
public class Pedidos {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="pedido_id")
    private Long pedido_id;
    public int codigo;
    public int codigoDeBarras;
    public String estado;// almacenado, transito, entregado
    
    @OneToOne()
    public Ruta ruta;
    
    @OneToMany
    @JoinColumn(name = "pro_id")//clave id de del objeto persona
    public ArrayList<Producto> productos = new ArrayList<Producto>();
    public boolean entregado;
    public String direccionDestino;
    public String tipoEntrega;// casa, departamento, barrio cerrado
    public String ciudad;
    public boolean esFavorito;
    public String barrio;
    public Date fechaPedido;

    public Pedidos(int codigoDeBarras, String estado, Ruta ruta, boolean entregado, String direccionDestino, String tipoEntrega, String ciudad, boolean esFavorito, String barrio, Date fechaPedido) {
        this.codigoDeBarras = codigoDeBarras;
        this.estado = estado;
        this.ruta = ruta;
        this.entregado = entregado;
        this.direccionDestino = direccionDestino;
        this.tipoEntrega = tipoEntrega;
        this.ciudad = ciudad;
        this.esFavorito = esFavorito;
        this.barrio = barrio;
        this.fechaPedido = fechaPedido;
    }

    
    
    
    /*
    TO DO
    
    getListadoProductos()
    getTiempoDeLlegadaPedido()
    */

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    
}
