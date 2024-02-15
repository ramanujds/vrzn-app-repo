package com.vz.app.service;

import java.util.List;

import com.vz.app.model.Trainee;

public interface TraineeService {
	
	List<Trainee> getAllTrainees();
	
	Trainee saveTrainee(Trainee trainee);
	
	Trainee findTrainee(int id);
	
	Trainee updateTrainee(Trainee trainee);
	
	void deleteTrainee(int id);
	

}
