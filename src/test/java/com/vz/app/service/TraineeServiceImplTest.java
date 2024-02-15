package com.vz.app.service;


import com.vz.app.model.Trainee;
import com.vz.app.repository.TraineeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TraineeServiceImplTest {

    @InjectMocks
    TraineeServiceImpl service;

    @Mock
    TraineeRepository repository;

    @Test
    public void testGetTraineeById(){

        // Given

        Trainee trainee = new Trainee();
        trainee.setId(1);
        trainee.setName("John");
        trainee.setEmail("john@yahoo.com");
        trainee.setLocation("Bangalore");

        // When
        Mockito.when(repository.findById(1)).thenReturn(Optional.of(trainee));

        // Then

        Trainee trainee1 = service.findTrainee(1);

        assertEquals(1, trainee1.getId());

    }

    @Test
    public void testSaveTrainee() {

        // Given

        Trainee trainee = new Trainee();
        trainee.setId(1);
        trainee.setName("John");
        trainee.setEmail("John@yahoo.com");

        // When

        Mockito.when(repository.save(trainee)).thenReturn(trainee);

        // Then

        Trainee trainee1 = service.saveTrainee(trainee);

        assertEquals(1, trainee1.getId());

    }



}
