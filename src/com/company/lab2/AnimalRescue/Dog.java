package com.company.lab2.AnimalRescue;

public class Dog {

    private String name;
    private int age ;
    private double weight ;
    private String color;
    private double heightInMeters ;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    void bark(){
        System.out.println("Ham!");
    }

    void eat(){
        System.out.println("eating dogfood!");
    }

    void sleep(){
        System.out.println("ZzzzZZzz... *snore*");
    }


}
