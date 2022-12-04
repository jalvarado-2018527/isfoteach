package com.isfortech.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.isfortech.Models.*;
import com.isfortech.Servieses.*;



@RestController
@RequestMapping(value ="/horario", produces = MediaType.APPLICATION_JSON_VALUE)
public class HorarioController {
    @Autowired
    private final HorarioService horarioService;
    
    public HorarioController(HorarioService horarioService){
        this.horarioService = horarioService;
    }

    @GetMapping( path = "/{id}")
    public Optional<HorarioModel> obtenerPorId(@PathVariable("id")Integer id){
        return this.horarioService.obtenerPorId(id);
    }
    @GetMapping()
    public ArrayList<HorarioModel> obtenerHorario(){
        return horarioService.obtenerHorario();
    }
    @PostMapping()
    public HorarioModel guardarHorario(@RequestBody HorarioModel horario){
        return this.horarioService.guardarHorario(horario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorid(@PathVariable("id") Integer id){
        boolean ok = this.horarioService.eliminarHorario(id);
        if(ok){
            return "se elimino el horario con id " + id;
        }else {
            return "no pudo eliminar el horario id "+ id;
        }
    }
/* 
    @Autowired
    HorarioService horarioService;

    @GetMapping()
    public ArrayList<HorarioModel> obtenerHorario(){
        return horarioService.obtenerHorario();
    }
    @PostMapping()
    public HorarioModel guardarHorario(@RequestBody HorarioModel horario){
        return this.horarioService.guardarHorario(horario);
    }
    @GetMapping( path = "/{id}")
    public Optional<HorarioModel> obtenerPorId(@PathVariable("id")Integer id){
        return this.horarioService.obtenerPorId(id);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorid(@PathVariable("id") Integer id){
        boolean ok = this.horarioService.eliminarHorario(id);
        if(ok){
            return "se elimino el horario con id " + id;
        }else {
            return "no pudo eliminar el horario id "+ id;
        }
    }
    */
}
