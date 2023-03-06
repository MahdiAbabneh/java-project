package com.company;
class Person{
    //instance
     String name;
     int age;
    //Methods
    public void speek() {
        System.out.println("my name is" + name);
    }
    //Method Parameters
    public void say(String Text,int HowLong){
        System.out.println(Text+" "+HowLong);
    }



}

public class Main {

    public static void main(String[] args) {
       Person Person_=new Person(); //object for class Person
       Person_.name="MAHDI";
       Person_.age=18;
       Person_.speek();
       Person_.say("Hi",2);

    }
}
