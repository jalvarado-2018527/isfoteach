package com.isfortech.Servieses;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isfortech.Models.DistribuidorModel;
import com.isfortech.Repositories.DistribuidorRepository;

@Service
public class DistribuidorService {
    @Autowired
    DistribuidorRepository distribuidorRepository;

    public DistribuidorService(DistribuidorRepository distribuidorRepository){
        this.distribuidorRepository = distribuidorRepository;
    }

    public Optional<DistribuidorModel> obtenerPorCodigo(Integer id){
        return distribuidorRepository.findById(id);

    }

    public DistribuidorModel getDistribuidor(int id){
        return distribuidorRepository.getOne(id);
    }

    public DistribuidorModel guardarDistribuidor(DistribuidorModel distribuidor){
        return distribuidorRepository.save(distribuidor);
    }
    public ArrayList<DistribuidorModel> obtenerDistribuidor(){
        return (ArrayList<DistribuidorModel>) distribuidorRepository.findAll();
    }

    public boolean eliminarDistribuidor(Integer id){
        try {
            distribuidorRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /*  

    public DistribuidorModel guardarDistribuidor(DistribuidorModel distribuidor){
        return distribuidorRepository.save(distribuidor);

    }

    public Optional<DistribuidorModel> obtenerPorCodigo(Integer id){
        return distribuidorRepository.findById(id);

    }

    public boolean eliminarDistribuidor(Integer id){
    try {
        distribuidorRepository.deleteById(id);
        return true;
    } catch (Exception e) {
        return false;
    }

    }
    */ 
}
