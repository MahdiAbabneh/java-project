package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Hello World Project
        System.out.println("Hello World");

        //Declared the variable
        int IntNumber;
        //Initialing the variable
        IntNumber = 100;

        //Starting out with Expressions

        int firstNumber=5;
        int secondNumber=firstNumber*2;
        int thirdNumber=(5+10)+(5*2);
        int sumNumber=firstNumber+secondNumber+thirdNumber;
        System.out.println(sumNumber);
        int lastNumber=1000-sumNumber;
        System.out.println(lastNumber);

        //Primitive Types.
        /*
        byte      1 byte     0
        short     2 bytes    0
        long      8 bytes    0L
        int       4 bytes    0
        float     4 bytes    0.0f
        double    8 bytes    0.0d
        boolean   1 bit      false
        char      2 bytes   '\u0000' or 'null'
         */

        System.out.println(Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        System.out.println(Double.MIN_VALUE+" to "+Double.MAX_VALUE);
        System.out.println(Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        int x= Integer.MAX_VALUE+1; //Overflow
        System.out.println(x);
        int y=Integer.MIN_VALUE+1;//underflow
        System.out.println(y);

        int a=100;
        short c=5;
        byte d=25;
        long sum_=a+d+c;
        System.out.println(sum_);
        boolean mahdi=true;
        float b=5.5f;
        double g=4.0;





        //Casting
        //Narrowing Casting
        double n1=5.5;
        int n1cast=(int)n1;
        System.out.println(n1cast);
        //Widening Casting
        int num=9;
        double numD=num;
        System.out.println(numD);

        // Operators (+, -, *, / ,%)
        int s1=1+2;  //3
        int s2=10-5; //5
        int s3=5*2;  //10
        int s4=10/2;  //5
        int s5=100%3; //1 Remainder after division

        // Abbreviating Operators (++, --, +=, -=, *=, /=, %=)
        int q1=4;
        q1+=3; //q1=q1+4, q1=7
        q1++; //q1=8
        q1--; //q1=7

        //if Statement
        boolean w1=true;
        if(w1)
            System.out.println("YES");
        if (w1)
        {
            System.out.println("w1 is  true");
            System.out.println("yes");
        }

        //Relational Operators (<, >, =, <=, >=, ==, !=) true or false
        int k1=5;
        int k2=10;
        System.out.println(k1>k2);
        System.out.println(k1<k2);
        System.out.println(k1==k2);
        System.out.println(k1!=k2);

        // Logical Operators (And &&, Or ||, !)
        if((5>4 && 6>5)) //need all true to true
            System.out.println("true");
        if((5>4 || 2>5)) //need at least one true to true
            System.out.println("true");
        if(!(2>4)) // if true is false, if false is true
            System.out.println("is true ? yes");

        //Assignment Operator VS Equals to Operator (=, ==)
        int number1=5; // = : to assign the value
        int number2=10;
        if(number1==number2) // ==: checks whether the two given operands are equal or not
            System.out.println("yes");

        //Ternary Operator
       int z=5;
       int m=10;
       int max;
       max=z<m ? z:m;
       System.out.println(max);



    }
}
