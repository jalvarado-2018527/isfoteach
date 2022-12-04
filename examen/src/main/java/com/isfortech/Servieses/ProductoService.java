package com.isfortech.Servieses;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isfortech.Models.*;
import com.isfortech.Repositories.*;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    public ProductoModel getProducto(int id){
        return productoRepository.getOne(id);
    }

    public ProductoModel guardarProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }
    
    public ArrayList<ProductoModel> obtenerProducto(){
        return (ArrayList<ProductoModel>) productoRepository.findAll();
    }
    public boolean eliminarProducto(Integer id){
        try {
            productoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* 
    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> obtenerProducto(){
        return (ArrayList<ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel guardarProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }

    public Optional<ProductoModel>obtenerPorId(Integer id){
        return productoRepository.findById(id);
    }

    public boolean eliminarProducto(Integer id){
        try {
            productoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    */
}
