package com.vz.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vz.app.model.Trainee;


public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

}
