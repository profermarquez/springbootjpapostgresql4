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
@Entity(name="Contratos")

public class Contratos extends Documentos{
    public int nroExpediente;
    public String estudioAcargo;

    public int getNroExpediente() {
        return nroExpediente;
    }

    public void setNroExpediente(int nroExpediente) {
        this.nroExpediente = nroExpediente;
    }

    public String getEstudioAcargo() {
        return estudioAcargo;
    }

    public void setEstudioAcargo(String estudioAcargo) {
        this.estudioAcargo = estudioAcargo;
    }

}
