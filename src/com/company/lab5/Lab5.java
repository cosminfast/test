package com.company.lab5;

public class Lab5 {
    public static void main(String[] args) {
        Logic logic = new Logic();

        int[] myArray = logic.setConsecutiveValuesToArray(1,100);

        logic.printArray(myArray);

//        Write a Java program to calculate
//        the average value of array elements.

        double sum = 0;
        for (int i = 0; i < myArray.length;i++){
            sum = sum + myArray[i]; // sum +=myArray[i];

        }
        double average = sum/myArray.length;
        System.out.println(average);

//        Write a Java program to test if an
//        array contains a specific value.
    }
}
