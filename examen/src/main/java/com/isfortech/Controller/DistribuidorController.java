package com.isfortech.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.isfortech.Models.*;
import com.isfortech.Servieses.*;

@RestController
@RequestMapping(value = "/distribuidor", produces = MediaType.APPLICATION_JSON_VALUE)
public class DistribuidorController {
    @Autowired
    private final DistribuidorService distribuidorService;
    
    public DistribuidorController(DistribuidorService distribuidorService){
        this.distribuidorService = distribuidorService;
    }

    @GetMapping( path = "/{id}")
    public DistribuidorModel getDistribuidor(@PathVariable("id")Integer id){
        return this.distribuidorService.getDistribuidor(id);
    }

    @PostMapping()
    public DistribuidorModel guardarDistribuidor(@RequestBody DistribuidorModel distribuidor){
        return this.distribuidorService.guardarDistribuidor(distribuidor);
    }
    @GetMapping()
    public ArrayList<DistribuidorModel> obtenerDistribuidor(){
        return distribuidorService.obtenerDistribuidor();
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorid(@PathVariable("id") Integer id){
        boolean ok = this.distribuidorService.eliminarDistribuidor(id);
        if(ok){
            return "se elimino el distribuidor con id " + id;
        }else {
            return "no pudo eliminar el distribuidor id "+ id;
        }
    }

    /* 
    @Autowired
    DistribuidorService distribuidorService;
    @GetMapping()
    public ArrayList<DistribuidorModel> obtenerDistribuidor(){
        return distribuidorService.getDistribuidor();
    }
    @PostMapping()
    public DistribuidorModel guardarDistribuidor(@RequestBody DistribuidorModel distribuidor){
        return this.distribuidorService.guardarDistribuidor(distribuidor);
    }
    @GetMapping( path = "/{id}")
    public Optional<DistribuidorModel> obtenerobtenerPorCodigo(@PathVariable("id")Integer id){
        return this.distribuidorService.obtenerPorCodigo(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorid(@PathVariable("id") Integer id){
        boolean ok = this.distribuidorService.eliminarDistribuidor(id);
        if(ok){
            return "se elimino el usuario con id " + id;
        }else {
            return "no pudo eliminar el usuario id "+ id;
        }
    } */ 
}
