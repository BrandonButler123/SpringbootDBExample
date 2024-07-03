package com.keyin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Dog {
    @Id
    @SequenceGenerator(name = "dog_sequence", sequenceName = "dog_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "dog_sequence")
    private long id;

    private String name;

    private int age;

    private String breed;

    public Dog() {
    }

    public Dog(long id, String name, int age, String breed) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
