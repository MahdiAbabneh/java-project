package com.company;
class Calculator
{
    public static void printSum1(int a,int b) //static method
    {
        System.out.println("Sum= "+(a+b));
    }
    public  void printSum2(int a,int b) //instance method
    {
        System.out.println("Sum= "+(a+b));
    }
}

public class Main {

    public static void main(String[] args) {
        Calculator.printSum1(5,4); //called static
        Calculator calculator=new Calculator();
        calculator.printSum2(5,4);



    }
}
