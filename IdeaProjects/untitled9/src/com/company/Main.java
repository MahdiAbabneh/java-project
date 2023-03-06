package com.company;
class Animal
{
    public void who()
    {
        System.out.println("Animal" );
    }
}
class Cat extends Animal
{
    public void who()
    {
        System.out.println("Cat");

    }
}
class Man
{
    String name;
    public void print()
    {
        System.out.println(name);
    }
}
class Man2 extends Man
{
    int age;
    public void print()
    {
        System.out.println(age);
    }
}
public class Main {

    public static void main(String[] args) {
        Animal animal=new Cat(); //Up Casting
        animal.who();

        Man man=new Man2();
        man.name="mahdi";
        Man2 man2=(Man2) man; //Down Casting
        man2.age=23;



    //Casting Numerical Values
    double n1=5.5;
    int n1cast=(int)n1; //Narrowing Casting
    System.out.println(n1cast);
    int num=9;
    double numD=num; //Widening Casting
    System.out.println(numD);
    }
}
