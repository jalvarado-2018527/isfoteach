package com.isfortech.Repositories;

import org.springframework.stereotype.Repository;
import com.isfortech.Models.DistribuidorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface DistribuidorRepository extends JpaRepository<DistribuidorModel, Integer> {
    
}
