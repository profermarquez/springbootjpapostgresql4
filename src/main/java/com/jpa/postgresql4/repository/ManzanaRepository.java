/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.postgresql4.repository;

import com.jpa.postgresql4.models.Manzana;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface ManzanaRepository extends CrudRepository<Manzana, Long>{
    Manzana findByNombre(String nombre);

    Manzana findById(long id);
}
