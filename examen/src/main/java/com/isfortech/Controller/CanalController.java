package com.isfortech.Controller;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.isfortech.Models.*;
import com.isfortech.Servieses.*;


@RestController
@RequestMapping(value ="/canal", produces = MediaType.APPLICATION_JSON_VALUE)
public class CanalController {
    @Autowired
    private final CanalService canalService;
    
    public CanalController(CanalService canalService){
        this.canalService = canalService;
    }

    @GetMapping()
    public ArrayList<CanalModel> obtenerCanal(){
        return  canalService.obtenerCanal();
    }

    @GetMapping( path = "/{id}")
    public Optional<CanalModel> obtenerPorId(@PathVariable("id")Integer id){
        return this.canalService.obtenerPorId(id);
    }

    @PostMapping()
    public CanalModel guardarCanal(@RequestBody CanalModel canal){
        return this.canalService.guardarCanal(canal);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorid(@PathVariable("id") Integer id){
        boolean ok = this.canalService.eliminarCanal(id);
        if(ok){
            return "se elimino el usuario con id " + id;
        }else {
            return "no pudo eliminar el usuario id "+ id;
        }
    }
    
    /*@Autowired
    CanalService canalService;

    @GetMapping()
    public ArrayList<CanalModel> obtenerCanal(){
        return  canalService.obtenerCanal();
    }
    @PostMapping()
    public CanalModel guardarCanal(@RequestBody CanalModel canal){
        return this.canalService.guardarCanal(canal);
    }
    @GetMapping( path = "/{id}")
    public Optional<CanalModel> obtenerPorId(@PathVariable("id")Integer id){
        return this.canalService.obtenerPorId(id);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarPorid(@PathVariable("id") Integer id){
        boolean ok = this.canalService.eliminarCanal(id);
        if(ok){
            return "se elimino el usuario con id " + id;
        }else {
            return "no pudo eliminar el usuario id "+ id;
        }
    }
    */
}

