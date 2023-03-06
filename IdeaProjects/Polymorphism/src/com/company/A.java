package com.company;

public class A {

    public int max(int number1, int number2) {
        if (number1 > number2)
            return number1;
        else
            return number2;
    }

    public double max(double number1, double number2) //Overloading
    {
        if (number1 > number2)
            return number1;
        else
            return number2;
    }

}
