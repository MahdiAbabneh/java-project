package com.company;

class Person{
    //instance
    private String name;
    private int age;
    //Get and Set


    public void setName(String name) {
        this.name = name;
    }
    String getName(){
        return name;
    }

}

public class Main {

    public static void main(String[] args) {
        Person Person_=new Person();
        Person_.setName("Ahmad");
        System.out.println(Person_.getName());
    }
}