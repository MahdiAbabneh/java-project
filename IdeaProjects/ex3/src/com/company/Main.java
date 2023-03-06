package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(false,2));
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay) {

        if ((barking==true)&&(hourOfDay > 23 || hourOfDay < 0))
        {
            return false;

        }
        else if ((barking==true)&&(hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        else if (barking==false)
        {
            System.out.println("the dog is not barking");
        }
        return false;


    }
}
