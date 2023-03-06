package com.company;
abstract class Person
{
    String name;
    int age;
    public abstract void print();

}

class Person_ extends Person
{
    public void print()//overriding
    {
        System.out.println(name+age);
    };
}

public class Main {

    public static void main(String[] args) {
       // Person a=new Person();

	Person_ man=new Person_();
    man.name="mahdi";
    man.age=23;
    man.print();
    }
}
