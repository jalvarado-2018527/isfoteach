package com.isfortech.Servieses;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isfortech.Models.*;
import com.isfortech.Repositories.*;
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioModel getusuario(int id){
        return usuarioRepository.getOne(id);
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
    
    public ArrayList<UsuarioModel> obtenerUsuario(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public boolean eliminarUsuario(Integer id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    /*
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuario(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();

    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);

    }

    public Optional<UsuarioModel> obtenerPorCodigo(Integer id){
        return usuarioRepository.findById(id);

    }

    public boolean eliminarUsuario(Integer id){
    try {
        usuarioRepository.deleteById(id);
        return true;
    } catch (Exception e) {
        return false;
    }

    }
     */
}
