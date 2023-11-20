/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.repository;

import com.jpa.postgresql4.models.Cliente;
import com.jpa.postgresql4.models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
    
    public Cliente findByUsuario(Usuario usr);
    
    
}
