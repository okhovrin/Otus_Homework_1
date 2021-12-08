package com.otus.khovrin.dz1;

public class Cat extends Animal{
    public Cat(String name, String color, int weight, int age) {
        super(name, color, weight, age);
    }
    @Override
    public void say() {
        System.out.println("Мяу");
    }
}
