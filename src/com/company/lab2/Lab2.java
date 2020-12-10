package com.company.lab2;

public class Lab2 {
    static int result;
    static int firstNumber = 5;
    static int second =6;

    public static void main(String[] args) {
        result= divide(firstNumber, second);
        System.out.println(result);

        result = sum(firstNumber, second);
        System.out.println(result);
        result  = sum(3,5);

        System.out.println(result);

        int localVariable =5;

        System.out.println(localVariable);
    }


    static int sum(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }

    static int divide(int firstNumber, int secondNumber) {
        return (firstNumber / secondNumber);
    }

    public void print(){
        String pattern = "ceva";
        System.out.println("text");
    }

    static void printMyName(){
        System.out.println("Hello");
        System.out.println("Cosmin");
    }



}

