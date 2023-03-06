package com.company;
class Dog1
{
    private static String name1;


    public Dog1(String name1) {
        this.name1=name1;

    }
    public void print()
    {
        System.out.println("name: "+name1);

    }
}
class Dog2
{
    private  String name2;


    public Dog2(String name2) {
        this.name2=name2;

    }
    public void print()
    {
        System.out.println("name: "+name2);

    }
}

public class Main {

    public static void main(String[] args) {
	Dog1 dog1=new Dog1("Bobi");
    Dog1 dog2=new Dog1("Bo");
    dog1.print();
    dog2.print();
    Dog2 dog3=new Dog2("Bobi");
    Dog2 dog4=new Dog2("Bo");
    dog3.print();
    dog4.print();

    }
}
