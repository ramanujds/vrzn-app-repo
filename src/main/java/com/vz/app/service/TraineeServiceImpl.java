package com.vz.app.service;

import java.util.List;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vz.app.model.Trainee;
import com.vz.app.repository.TraineeRepository;

@Service
@Setter
public class TraineeServiceImpl implements TraineeService {
	
	private TraineeRepository repository;


	
	@Autowired
	public TraineeServiceImpl(TraineeRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Trainee> getAllTrainees() {
		return repository.findAll();
	}

	@Override
	public Trainee saveTrainee(Trainee trainee) {
		return repository.save(trainee);
	}

	@Override
	public Trainee findTrainee(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		return repository.save(trainee);
	}

	@Override
	public void deleteTrainee(int id) {
		repository.deleteById(id);
	}

}
