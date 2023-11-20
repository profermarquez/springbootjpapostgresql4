/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.services;

import com.jpa.postgresql4.models.Pedidos;
import com.jpa.postgresql4.repository.PedidosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sebastian
 */
interface PedidoImp{
public void save(Pedidos pedido);
public Object findById(long id);
public void delete(Pedidos pedido);
public List<Pedidos> getAll();
public Object findAllPedidos(long id);
}

@Service
public class PedidosServicio implements PedidoImp{
    
    @Autowired
    PedidosRepository pedidoRepository;
    
    @Override
    public void save(Pedidos pedido) {
        //TODO control null
        
        this.pedidoRepository.save(pedido);
    }
    
    @Override
    public Object findAllPedidos(long id){
    return this.pedidoRepository.findAll();
    }

    @Override
    public Object findById(long id) {
        return this.pedidoRepository.findAllById(id);
    }

    @Override
    public void delete(Pedidos pedido) {
        this.pedidoRepository.delete(pedido);
    }
    public List<Pedidos> getAll()
        {
            return (List<Pedidos>) this.pedidoRepository.findAll();
        }
    
}
