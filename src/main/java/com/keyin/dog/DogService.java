package com.keyin.dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public void createDog(Dog dog) {
        dogRepository.save(dog);

    }

    public List<Dog> getListOfAllDogs(){
       return (List<Dog>) dogRepository.findAll();


    }

    public Optional<Dog> getDogById(Long id) {
        return dogRepository.findById(id);

    }
}
