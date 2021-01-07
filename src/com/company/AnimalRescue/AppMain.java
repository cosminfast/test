package com.company.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog myDog = new Dog();

        System.out.println(myDog.getAge());
        System.out.println(myDog.getName());
        myDog.bark();
        myDog.setName("Becs");
        System.out.println(myDog.getName());

        Dog mySecondDog = new Dog();
        Dog mySecondDog2 = new Dog();
        Dog mySecondDog3 = new Dog();
        Dog mySecondDog4 = new Dog();
        mySecondDog3.setColor("roz");
        mySecondDog.setName("Tex");
        System.out.println(mySecondDog.getName());

        Duck quack = new Duck();
        quack.setName("rata");
        quack.setAge(3);

        Labrador tomy = new Labrador();
        tomy.setName("Tommy");
        tomy.eat();

        GreenDuck ducky = new GreenDuck();
        ducky.setName("Duck");

    }
}
