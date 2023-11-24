/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.controller;

import com.jpa.postgresql4.models.Cliente;
import com.jpa.postgresql4.models.Pedidos;
import com.jpa.postgresql4.repository.ProductoRepository;
import com.jpa.postgresql4.services.PedidosServicio;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.jpa.postgresql4.services.UsuarioServicio;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Sebastian
 */
@Controller
public class ClienteController {
    
    @Autowired
    PedidosServicio pedidoServicio;
    @Autowired
    UsuarioServicio usuarioServicio;
    @Autowired
    ProductoRepository productoRepository;
    
    Long codigo_cliente;
    Cliente cliente;
    String cli_nom;

    @RequestMapping(value = "/cliente/index", method = RequestMethod.GET)
    public String getIndexPage(HttpServletRequest request,Model model,RedirectAttributes redirectAttributes) {
        String username=request.getUserPrincipal().getName();
        Cliente obj= (Cliente)this.usuarioServicio.getPersonaCliente(username);
        this.cli_nom =obj.getNombreyApellido();
        this.cliente=obj;
        this.codigo_cliente=obj.getId();
        
        cli_nom = cliente.getNombreyApellido();
        codigo_cliente = cliente.getId();//codigo persona
        model.addAttribute("nombre_cliente", cli_nom);
        //System.out.println(cliente.getId());
        redirectAttributes.addFlashAttribute("cliente", cliente);
        return "/cliente/index";
    }
    
    @RequestMapping(value="/cliente/pedidos",method = RequestMethod.GET)
    public String verPedidos(HttpServletRequest request,Model modelo,RedirectAttributes redirectAttributes) {
        //System.out.println(modelo);
        Cliente cliente = (Cliente) modelo.getAttribute("cliente");
        if(cliente==null){System.out.println("Error, cliente nulo.");return "/logout";}
        Object obj= this.pedidoServicio.findAllPedidos(cliente.getId());
        //System.out.println(obj);
        modelo.addAttribute("pedidos", obj);
        redirectAttributes.addFlashAttribute("cliente", cliente);
        return "/cliente/pedidos";
    }
    
    @RequestMapping(value="/cliente/realizarpedido",method = RequestMethod.GET)
    public String nuevoPedido(Model model,RedirectAttributes redirectAttributes )//,RedirectAttributes redirectAttributes,BindingResult result) 
    {
            /*redirectAttributes.addFlashAttribute("cliente", this.cliente);
        if (result.hasErrors()) {
            System.out.println("Error en la creacion de pedidos...");
        }*/
        
        model.addAttribute("cities", this.productoRepository.findAll());
        return "/cliente/realizarpedido";
    }
    @RequestMapping(value="/cliente/realizarpedido/new",method = RequestMethod.POST)
    public String crearPedido(@ModelAttribute("pedido") Pedidos pedido,RedirectAttributes redirectAttributes, BindingResult result, Model model) {//@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            System.out.println("Error en la creacion de pedidos...");
        }
        this.pedidoServicio.save(pedido);
        return "redirect:/cliente/index";
    }
    
    @GetMapping("/cliente/pedidos/edit/{id}")
    public String editProductForm(@PathVariable Long id, Model model) {
        //model.addAttribute("product", productRepository.findById(id).orElse(null));
        return "redirect:/cliente/pedidos";
    }
 
    @GetMapping("/cliente/pedidos/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        //productRepository.deleteById(id);
        return "redirect:/cliente/pedidos";
    }

}
