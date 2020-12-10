package com.company.lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog myDog = new Dog();

        System.out.println(myDog.age);
        System.out.println(myDog.name);
        myDog.bark();
        myDog.name = "Becs";
        System.out.println(myDog.name);

        Dog mySecondDog = new Dog();
        Dog mySecondDog2 = new Dog();
        Dog mySecondDog3 = new Dog();
        Dog mySecondDog4 = new Dog();
        mySecondDog3.color = "roz";
        mySecondDog.name = "tex";
        System.out.println(mySecondDog.name);
    }
}
