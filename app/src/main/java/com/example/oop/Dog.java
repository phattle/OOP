package com.example.oop;

public class Dog extends Animal{

    public Dog(String name, Integer weight) {

        super(name, weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}