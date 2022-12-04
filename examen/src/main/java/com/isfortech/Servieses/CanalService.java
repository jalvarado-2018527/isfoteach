package com.isfortech.Servieses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;
import com.isfortech.Models.CanalModel;
import com.isfortech.Repositories.CanalRepository;

@Service
public class CanalService {
    @Autowired
    CanalRepository canalRepository;

    public CanalService(CanalRepository canalRepository){
        this.canalRepository = canalRepository;
    }

    public CanalModel getCanal(int id){
        return canalRepository.getOne(id);
    }

    public CanalModel guardarCanal(CanalModel canal){
        return canalRepository.save(canal);
    }
    
    public ArrayList<CanalModel> obtenerCanal(){
        return (ArrayList<CanalModel>) canalRepository.findAll();
    }

    public Optional<CanalModel> obtenerPorId(Integer id){
        return canalRepository.findById(id);
    }
    

    public boolean eliminarCanal(Integer id){
        try {
            canalRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    } 
    /*@Autowired
    CanalRepository canalRepository;

    public ArrayList<CanalModel> obtenerCanal(){
        return (ArrayList<CanalModel>) canalRepository.findAll();
    }
    public CanalModel guardarCanal(CanalModel canal){
        return canalRepository.save(canal);
    }
    public Optional<CanalModel> obtenerPorId(Integer id){
        return canalRepository.findById(id);
    }
    public boolean eliminarCanal(Integer id){
        try {
            canalRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    } */
    
}
