package com.isfortech.Repositories;

import org.springframework.stereotype.Repository;
import com.isfortech.Models.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Integer> {
    
    LoginModel findByNombre(String nombre);
}
