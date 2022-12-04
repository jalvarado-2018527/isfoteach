package com.isfortech.Repositories;

import com.isfortech.Models.UsuarioModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>  {
    
}
