package com.isfortech.Servieses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

import com.isfortech.Models.*;
import com.isfortech.Repositories.*;

@Service
public class HorarioService {
    @Autowired
    HorarioRepository horarioRepository;

    public HorarioService(HorarioRepository horarioRepository){
        this.horarioRepository = horarioRepository;
        
    }

    public HorarioModel getHorario(int id){
        return horarioRepository.getOne(id);
    }

    public HorarioModel guardarHorario(HorarioModel horario){
        return horarioRepository.save(horario);
    }

    public ArrayList<HorarioModel>obtenerHorario(){
        return (ArrayList<HorarioModel>) horarioRepository.findAll();
    }

    public Optional<HorarioModel> obtenerPorId(Integer id){
        return horarioRepository.findById(id);
    }

    public boolean eliminarHorario(Integer id){
        try {
            horarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }  
    /* 
    @Autowired
    HorarioRepository horarioRepository;

    public ArrayList<HorarioModel>obtenerHorario(){
        return (ArrayList<HorarioModel>) horarioRepository.findAll();
    }
    public HorarioModel guardarHorario(HorarioModel horario){
        return horarioRepository.save(horario);
    }
    public Optional<HorarioModel> obtenerPorId(Integer id){
        return horarioRepository.findById(id);
    }

    public boolean eliminarHorario(Integer id){
        try {
            horarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    */
}
