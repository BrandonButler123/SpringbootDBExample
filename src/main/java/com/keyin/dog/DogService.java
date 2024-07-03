package com.keyin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public void createDog(Dog dog) {
        dogRepository.save(dog);

    }
}
