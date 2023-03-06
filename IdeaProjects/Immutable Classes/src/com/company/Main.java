package com.company;

public class Main {

    public static void main(String[] args) {
        // create object of Immutable
        Immutable obj = new Immutable("Programiz", 2011);

        System.out.println("Name: " + obj.getName());
        System.out.println("Date: " + obj.getDate());
    }
}
