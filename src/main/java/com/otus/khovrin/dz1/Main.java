package com.otus.khovrin.dz1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //создание листа
        ArrayList<Animal> animals = new ArrayList();
        Animal animal = new Animal("Barsik", "yellow");
        Animal cat = new Cat("", "", 0, 0);
        Animal dog= new Dog("", "", 0, 0);
        Animal duck = new Duck("", "", 0, 0);

        Scanner scan  = new Scanner(System.in);
        String menu = "";

        while (!menu.equals("exit")) {
            System.out.println("Меню:");
            System.out.println("Введите add:");
            System.out.println("Введите list:");
            System.out.println("Введите exit:");
 //           System.out.printf("Name:   Age:   weight:  \n", duck.name, duck.age, duck.weight);
            menu = scan.next().toLowerCase().trim();

            switch(menu){
                case "add":
                    System.out.println("Укажите bvz животного");
                 String name = scan.next().toLowerCase().trim();
                    Animal animalToAdd = new Animal(name, "yellow");
                    animals.add(animalToAdd);
                    break;
                case "list":
                    String[] stringValues = {"cat", "dog", "duck"};
                    System.out.println(Arrays.toString(stringValues));
                    break;
                case "exit":
                    System.out.println("выход");
                    break;
                default:
                    System.out.println("incorrect");
                     break;
            }
        }


        //добавление в лист элементов
        animals.add(animal);
        animals.add(cat);
        animals.add(dog);
        animals.add(duck);


        animal.age = 6;
        animal.weight = 16;
        animal.color = "orange";
 //       animal.drink();

        System.out.println(animal);
 //       System.out.println(duck);


    }
}
