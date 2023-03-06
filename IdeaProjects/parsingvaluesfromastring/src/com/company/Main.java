package com.company;

public class Main {

    public static void main(String[] args) {
        String numAsString="2018";
        System.out.println(numAsString);
        int number=Integer.parseInt(numAsString);
        System.out.println(number);
        numAsString=numAsString+1;
        number=number+1;
        System.out.println(numAsString);
        System.out.println(number);
    }
}
