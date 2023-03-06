package com.company;

class A {

    public int a;
    public int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display()
    {
        System.out.println("Display=" + "a= " +a+ " b= " + b);
    }
}
class B {

    private int number1;
    private float number2;


    public B setNumber1(int number1)
    {
        this.number1 = number1;
        return this;
    }

    public B setNumber2(float number2)
    {
        this.number2 = number2;
        return this;
    }

    void display()
    {
        System.out.println("Display=" + "number1= " +number1+ " number2= " + number2);
    }
}


public class Main {

    public static void main(String[] args) {
       // A a1=new A(5,5);
        //a1.display();
        new A(5,5).display();
        //B b1=new B();
        //b1.one(5);
        //b1.two(5);
        //b1.display();
        new B().setNumber1(5).setNumber2(5).display();
    }
}
