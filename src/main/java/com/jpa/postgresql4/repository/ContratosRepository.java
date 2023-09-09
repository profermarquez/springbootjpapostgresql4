/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.repository;

import org.springframework.data.repository.CrudRepository;
import com.jpa.postgresql4.models.Contratos;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface ContratosRepository extends CrudRepository<Contratos, Long>{
    
}
