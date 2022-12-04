package com.isfortech.Repositories;

import com.isfortech.Models.CanalModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CanalRepository extends JpaRepository<CanalModel, Integer> {

}
