package com.isfortech.Repositories;

import com.isfortech.Models.ProductoModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoModel, Integer>{
    
}
