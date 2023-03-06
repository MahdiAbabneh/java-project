package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number=10; // 'number=10':Expressions, int: Keywords , 'int number=10;':Statements

        // else if
        Scanner input=new Scanner(System.in);
        System.out.println("Plz-input-Yours mark");
        int Mark=input.nextInt();
        if(Mark>=90)
        {
            System.out.println("excellent");
        }
        else if (80<=Mark&&Mark<=89)
        {
            System.out.println("good");
        }
        else if (50<=Mark&&Mark<=60)
        {
            System.out.println("bad");
        }

        // Methods In Java
        myMethod();
        method1("mahdi");
        method2("mahdi",23);
        add(5,5);
        checkAge(20);
        //Method Overloading
        adding(5,5);
        adding(5.5,5.5);
        adding("mahdi","ababneh");
        adding(5);



    }
    // Methods In Java
    public static void myMethod()
    {
        System.out.println("mahdi");
    }
    public static void method1(String name)
    {
        System.out.println("hi i am "+name);
    }
    public static void method2(String name,int age)
    {
        System.out.println("hi i am "+name+" i have "+age);
    }
    public static int add(int x,int y)
    {
        return x+y;
    }
    public static void checkAge(int age)
    {
        if (age>50)
            System.out.println("old man");
        else
            System.out.println("small man");
    }
    //Method Overloading
    public static int adding(int x,int y)
    {
        return x+y;
    }
    public static double adding(double x,double y)
    {
        return x+y;
    }
    public static String adding(String x,String y)
    {
        return x+y;
    }
    public static int adding(int x)
    {
        return x++;
    }





}
