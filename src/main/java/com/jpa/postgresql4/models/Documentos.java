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
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import java.util.Date;

/**
 *
 * @author Sebastian
 */
@MappedSuperclass
public class Documentos {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="doc_id")
    private Long doc_id;
    
    public String titulo;
    public String descripcionDocumento;
    public Date fechaHora;
 
 private Long id;

    public Documentos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public Documentos(String titulo, String descripcionDocumento, Date fechaHora) {
        this.titulo = titulo;
        this.descripcionDocumento = descripcionDocumento;
        this.fechaHora = fechaHora;
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
