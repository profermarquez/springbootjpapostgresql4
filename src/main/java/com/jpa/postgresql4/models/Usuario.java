/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;




@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String email;
        
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
        @JoinColumn(name = "roll_id")
	private Roll roles;
        
    public String getRoles() {
        return roles.getNombre();
    }
    public Roll getRol() {
        return roles;
    }

    public void setRoles(Roll roles) {
        this.roles = roles;
    }

        
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

        public String getNombreRoll()
        {
            return this.roles.getNombre();
        }
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Usuario(Long id, String nombre, String apellido, String email, String password, Roll roles) {
		super();
		this.id = id;
		this.email = email;
                BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		this.password = passwordEncoder.encode(password);
               // System.out.println("pass "+this.password);
		this.roles = roles;
	}

	public Usuario(String email, String password, Roll roles) {
		super();
		this.email = email;
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		this.password = passwordEncoder.encode(password);
                //System.out.println("pass "+this.password);
		this.roles = roles;
	}

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }

	public Usuario() {
		
	}

}
