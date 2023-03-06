package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
    String name;
    int age;

    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}

public class Main {

    public static void main(String[] args)throws Exception {
        Student student = new Student("mahdi", 23);
        //Creating stream
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("success");
    }}