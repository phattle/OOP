package com.example.oop;

import androidx.annotation.NonNull;

public class Dog extends Animal{

    public Dog(String name, Integer weight) {

        super(name, weight);
    }

    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public void setName(@NonNull String name) {
        super.setName(name);
    }
}