package com.otus.khovrin.dz1;

public class Duck extends Animal implements Flying {
    public Duck(String name, String color, int weight, int age) {
        super(name, color, weight, age);
    }

    @Override
    public void fly() {
        System.out.println("я летаю");
    }
}

