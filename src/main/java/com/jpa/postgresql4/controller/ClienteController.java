/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.models.Cliente;
import com.jpa.postgresql4.models.Pedidos;
import com.jpa.postgresql4.services.PedidosServicio;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sebastian
 */
@Controller
public class ClienteController {
    
    @Autowired
    PedidosServicio pedidoServicio;
    
    Long codigo_cliente;
    Cliente cliente;
    String cli_nom;

    @RequestMapping(value = "/cliente/index", method = RequestMethod.GET)
    public String getIndexPage(Model model) {
        cliente = (Cliente) model.getAttribute("cliente");
        cli_nom = cliente.getNombreyApellido();
        codigo_cliente = cliente.getId();//codigo persona
        model.addAttribute("nombre_cliente", cli_nom);
        return "/cliente/index";
    }

    /*
    @GetMapping("/cliente/index",(@ModelAttribute("quote") String quote)
            
	public String indexCliente() {
                System.out.println(quote);
		return "/cliente/index";
	}*/
    
    @GetMapping("/cliente/pedidos")
    public String verPedidos(HttpServletRequest request,Model modelo) {

        Object obj= this.pedidoServicio.findAllPedidos(this.codigo_cliente);
        System.out.println(obj);
        modelo.addAttribute("pedidos", obj);

        return "/cliente/pedidos";
    }
    
    @PostMapping("/cliente/pedidos")
    public String addPedidos(Pedidos pedido, BindingResult result, Model model) {//@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            System.out.println("Error en la creacion de pedidos...");
        }

        this.pedidoServicio.save(pedido);
        return "redirect:/cliente/pedidos";
    }

}
