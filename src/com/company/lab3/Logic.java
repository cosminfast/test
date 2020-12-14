package com.company.lab3;

public class Logic {

    public int compareNumbers(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public String compareStrings(String value) {

        if (value.equals("FastTrack")) {
            return ("Learning text comparison");
        } else {
            return "Got to try some more";
        }
    }

    public int verifyInInterval(int aNumber) {
        if (aNumber >= 2 && aNumber <= 8) {
            return aNumber;
        } else {
            return -1;
        }

    }

    public String verifyTextAndNumberInterval(int number, String text){
        if (text.equals("FastTrack") && number <= 3){
            return(text + number);
        } else if (!text.equals("FastTrack") && number >= 4){
           return(number + text);
        }else {
            return "";
        }
    }
}
