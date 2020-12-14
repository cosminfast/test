package com.company.lab3;

public class Lab3 {

    public static void main(String[] args) {
//        Given two numbers,
//        see which one is the
//        greatest and print it

        Logic logic = new Logic();
        int x = 2;
        int y = 2;
//        System.out.println(logic.compareNumbers(x, y));


//        Given a text input, if it is “FastTrack”, then
//        print “Learning text comparison”. If not,
//        print “Got to try some more”


        String text = "FastTrack";

//        System.out.println(logic.compareStrings(text));
//        System.out.println(logic.compareStrings("asd"));

// Given a number, if it’s equal to or higher than 2
// and equal to or lower than 8, print the number

        int aNumber = 9;

//        System.out.println(logic.verifyInInterval(aNumber));

//        Given a text input and a number input,
//        if the text is equal to “FastTrack”
//        AND the number is equal to or
//        lower than 3, print the text and
//        the number. If the text is not
//        “FastTrack” AND the number is equal
//        to or higher than 4, print the number
//        and the text, in this order


        System.out.println(logic.verifyTextAndNumberInterval(3, "FastTrack"));
        System.out.println(logic.verifyTextAndNumberInterval(2, "FastTrack"));
        System.out.println(logic.verifyTextAndNumberInterval(4, "FastTrack"));
        System.out.println(logic.verifyTextAndNumberInterval(4, "NotFast"));


    }
}
