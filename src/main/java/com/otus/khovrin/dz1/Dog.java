package com.otus.khovrin.dz1;

public class Dog extends Animal{
    public Dog(String name, String color, int weight, int age) {
        super(name, color, weight, age);
    }
    @Override
    public void say() {
        System.out.println("Гав");
    }
}
