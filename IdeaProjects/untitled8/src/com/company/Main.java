package com.company;

class A
{

    public int max (int number1,int number2)
    {
        if (number1>number2)
            return number1;
        else
            return number2;
    }
    public double max (double number1,double number2) //Overloading
    {
        if (number1>number2)
            return number1;
        else
            return number2;
    }

}
class B
{
    public void print()
    {
     System.out.println("hi");
    }

}
class C extends B
{
    public void print()
    {
        System.out.println("how are you");//overriding
    }}

public class Main {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.max(5, 6));
        System.out.println(a.max(5.5, 6.5));
        C c=new C();
        c.print();
    }
}
