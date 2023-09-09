/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.Entity;
import java.util.Date;


/**
 *
 * @author Sebastian
 */



@Entity
public class Producto extends Descriptores{
    
    public int codigo;
    public String categoria;
    public double precio;
    public boolean delicado;

    public Producto() {
    }

    public Producto(int codigo, String categoria, double precio, boolean delicado, String descripcion, Date fechayHora) {
        super(descripcion, fechayHora);
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
        this.delicado = delicado;
    }

    public Producto(int codigo, String categoria, double precio, boolean delicado) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
        this.delicado = delicado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDelicado() {
        return delicado;
    }

    public void setDelicado(boolean delicado) {
        this.delicado = delicado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(Date fechayHora) {
        this.fechayHora = fechayHora;
    }
    
    
    
}
