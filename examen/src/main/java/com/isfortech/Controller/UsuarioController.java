package com.isfortech.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.isfortech.Models.*;
import com.isfortech.Servieses.*;

@RestController
@RequestMapping(value ="/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;
    
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping( path = "/{id}")
    public UsuarioModel getProducto(@PathVariable("id")Integer id){
        return this.usuarioService.getusuario(id);

    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuario(){
        return usuarioService.obtenerUsuario();
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarporId(@PathVariable("id")Integer id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "se elimino el usuario con id " + id;
        }else {
            return "no pudo eliminar el usuario id "+ id;
        }
    }

    /*
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuario(){
        return usuarioService.obtenerUsuario();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }
    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerPorId(@PathVariable("id")Integer id){
        return this.usuarioService.obtenerPorCodigo(id);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarporId(@PathVariable("id")Integer id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "se elimino el usuario con id " + id;
        }else {
            return "no pudo eliminar el usuario id "+ id;
        }
    }
    */
}
