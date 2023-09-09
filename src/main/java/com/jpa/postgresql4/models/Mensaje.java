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
import jakarta.persistence.Table;
import java.util.Date;

/**
 *
 * @author Sebastian
 */
@Entity
public class Mensaje extends Descriptores{
    
    
    public boolean leido;
    public boolean contestado;
    public String remitente;
    public String destinatario;
    public String titulo;
    public boolean urgente;

    public Mensaje(boolean leido, boolean contestado, String remitente, String destinatario, String titulo, boolean urgente, String descripcion, Date fechayHora) {
        super(descripcion, fechayHora);
        this.leido = leido;
        this.contestado = contestado;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.titulo = titulo;
        this.urgente = urgente;
    }

    public Mensaje(boolean leido, boolean contestado, String remitente, String destinatario, String titulo, boolean urgente) {
        this.leido = leido;
        this.contestado = contestado;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.titulo = titulo;
        this.urgente = urgente;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    
    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public boolean isContestado() {
        return contestado;
    }

    public void setContestado(boolean contestado) {
        this.contestado = contestado;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
