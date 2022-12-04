package com.isfortech.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.isfortech.Models.*;
import com.isfortech.Servieses.*;

@RestController
@RequestMapping(value ="/producto", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductoController {
    private final ProductoService productoService;
    @Autowired
    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping( path = "/{id}")
    public ProductoModel getProducto(@PathVariable("id")Integer id){
        return this.productoService.getProducto(id);
    }
    @GetMapping()
    public ArrayList<ProductoModel> obtenerProducto(){
        return productoService.obtenerProducto();
    }
    @PostMapping()
    public ProductoModel guardaProducto(@RequestBody ProductoModel producto){
        return this.productoService.guardarProducto(producto);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorid(@PathVariable("id") Integer id){
        boolean ok = this.productoService.eliminarProducto(id);
        if(ok){
            return "se elimino el producto con id " + id;
        }else {
            return "no pudo eliminar el producto id "+ id;
        }
    }
    /*@Autowired
    ProductoService ProductoService;

    @GetMapping()
    public ArrayList<ProductoModel> obtenerProducto(){
        return ProductoService.obtenerProducto();
    }

    @PostMapping()
    public ProductoModel guardaProducto(@RequestBody ProductoModel producto){
        return this.ProductoService.guardarProducto(producto);
    }

    @GetMapping(path = "/{id}")
    public Optional<ProductoModel> obtenerPorCodigo(@PathVariable("id")Integer id){
        return this.ProductoService.obtenerPorId(id);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorid(@PathVariable("id") Integer id){
        boolean ok = this.ProductoService.eliminarProducto(id);
        if(ok){
            return "se elimino el producto con id " + id;
        }else {
            return "no pudo eliminar el producto id "+ id;
        }
    }
*/


}
