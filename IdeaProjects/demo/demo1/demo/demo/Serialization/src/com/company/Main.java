package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("mahdisdsddsasd","id");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("my_data.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student.toString());
            objectOutputStream.close();
           // objectOutputStream.close();
            System.out.println("The object has been saved to my_data file!");
        }
        catch(Exception e) {
            System.out.println(e);
    }
}}
