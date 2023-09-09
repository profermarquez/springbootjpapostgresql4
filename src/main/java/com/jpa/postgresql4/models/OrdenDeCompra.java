/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sebastian
 */
@Entity
public class OrdenDeCompra extends Documentos{
   
    @OneToMany
    @JoinColumn(name = "pro_id")//clave id de del objeto persona
    public ArrayList<Producto> productos = new ArrayList<>();
    public boolean recibido;
    public String tiempoentimado;
    public Date fechaEntrega;
    public String calificacion;// de 1 a 5 estrellas

    public OrdenDeCompra(boolean recibido, String tiempoentimado, Date fechaEntrega, String calificacion) {
        this.recibido = recibido;
        this.tiempoentimado = tiempoentimado;
        this.fechaEntrega = fechaEntrega;
        this.calificacion = calificacion;
    }

    public OrdenDeCompra(boolean recibido, String tiempoentimado, Date fechaEntrega, String calificacion, String titulo, String descripcionDocumento, Date fechaHora) {
        super(titulo, descripcionDocumento, fechaHora);
        this.recibido = recibido;
        this.tiempoentimado = tiempoentimado;
        this.fechaEntrega = fechaEntrega;
        this.calificacion = calificacion;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public boolean isRecibido() {
        return recibido;
    }

    public void setRecibido(boolean recibido) {
        this.recibido = recibido;
    }

    public String getTiempoentimado() {
        return tiempoentimado;
    }

    public void setTiempoentimado(String tiempoentimado) {
        this.tiempoentimado = tiempoentimado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcionDocumento() {
        return descripcionDocumento;
    }

    public void setDescripcionDocumento(String descripcionDocumento) {
        this.descripcionDocumento = descripcionDocumento;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
}
