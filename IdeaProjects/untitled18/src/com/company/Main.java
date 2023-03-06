package com.company;

class Num
{
   int number;

}

public class Main {
     static void fun(int n)//=1, not num //Passing by Value
    {
        n++;//n=2
    }
    static void fun2(Num a) //Passing by Reference
    {
        a.number++;
    }

    public static void main(String[] args) {
        int num=1;
        fun(num);
        System.out.println(num);


        Num num1=new Num();
        num1.number=1;
        fun2(num1);
        System.out.println(num1.number);




    }
}
