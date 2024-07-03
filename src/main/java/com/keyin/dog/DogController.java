package com.keyin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/dog")
public class DogController {

    @Autowired
    private DogService dogService;


    @PostMapping("/createDog")
    public ResponseEntity<String> createDog(@RequestBody Dog dog) {

        if(dog != null){
            dogService.createDog(dog);
            return  new ResponseEntity<>("Dog Has Been Created", HttpStatusCode.valueOf(200));
        }
        return  new ResponseEntity<>("Dog Object Is Empty", HttpStatusCode.valueOf(404));




    }
}
