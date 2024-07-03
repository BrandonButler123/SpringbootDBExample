package com.keyin.dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/dog")
public class DogController {

    @Autowired
    private DogService dogService;


    @PostMapping("/createDog")
    public ResponseEntity<?> createDog(@RequestBody Dog dog) {

        if(dog != null){
            dogService.createDog(dog);
            return  new ResponseEntity<>("Dog Has Been Created", HttpStatusCode.valueOf(200));
        }
        return  new ResponseEntity<>("Dog Object Is Empty", HttpStatusCode.valueOf(404));

    }

    @GetMapping("/listOfDogs")
    public List<Dog> getAllDogs() {

        return dogService.getListOfAllDogs();

    }

    @GetMapping("/{id}")
    public Optional<Dog> getDogById(@PathVariable Long id) {
        return dogService.getDogById(id);
    }
}
