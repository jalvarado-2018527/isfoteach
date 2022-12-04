package com.isfortech.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.isfortech.Models.HorarioModel;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface HorarioRepository extends JpaRepository<HorarioModel, Integer>  {
    
}
