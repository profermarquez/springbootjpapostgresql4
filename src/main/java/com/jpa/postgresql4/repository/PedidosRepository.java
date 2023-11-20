/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.repository;

import com.jpa.postgresql4.models.Pedidos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface PedidosRepository extends CrudRepository<Pedidos, Long>{

    public Object findAllById(long pedido_id);

   

    
    
}
