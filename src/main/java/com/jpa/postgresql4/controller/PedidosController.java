/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.models.Pedidos;
import com.jpa.postgresql4.services.PedidosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sebastian
 */
@Controller
public class PedidosController {

    //@Autowired
    
    //private PedidosServicio servicioPedidos;

    /*@RequestMapping(value = "/cliente/pedidos", method = RequestMethod.GET)
    public String showPedidosForm() {
        return "redirect:/cliente/pedidos";
    }
/*
    @PostMapping("/cliente/pedidos")
    public String addUser(Pedidos pedido, BindingResult result, Model model) {//@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }

        this.servicioPedidos.save(pedido);
        return "redirect:/cliente/pedidos";
    }*/

    /*@GetMapping("/cliente/pedidos/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Pedidos pedido = (Pedidos) this.servicioPedidos.findById(id);
        //.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("peido_modificado", pedido);
        return "redirect:/cliente/pedidos";
    }*/
/*
    @PostMapping("/cliente/pedidos/update/{id}")
    public String updateUser(@PathVariable("id") long id, Pedidos user,
            BindingResult result, Model model) {
      

        this.servicioPedidos.save(user);
        return "redirect:/cliente/pedidos";
    }*/
/*
    @GetMapping("/cliente/pedidos/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        Pedidos pedido = (Pedidos) this.servicioPedidos.findById(id);
               // .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        //TODO pedido confirmacion
        this.servicioPedidos.delete(pedido);
        return "redirect:/cliente/pedidos";
    }*/

}
