package com.vz.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vz.app.model.Trainee;
import com.vz.app.service.TraineeService;


import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/trainees")
@Slf4j
public class TraineeController {
	
	@Autowired
	private TraineeService service;
	
	@PostMapping
	public Trainee addTrainee(@RequestBody Trainee trainee) {
		log.info(trainee.toString());
		return service.saveTrainee(trainee);
	}
	
	@GetMapping
	public List<Trainee> getAllTrainees(){
		return service.getAllTrainees();
	}
	

}
