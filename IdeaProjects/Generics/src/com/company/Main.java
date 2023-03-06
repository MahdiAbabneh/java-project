package com.company;

import java.util.ArrayList;

class Person<T>
{
    T first_name;
    T last_name;

};
public class Main {

    public static void main(String[] args) {
        // Using Generics
        Person<String> man = new Person<String>();
        man.first_name = "mahdi";
        man.last_name = "Abaneh";
        //------------------------
        ArrayList<Integer> name = new ArrayList<Integer>();
        name.add(10);
        name.add(20);
    }
}