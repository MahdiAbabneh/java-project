package com.company;
class Person {
    //instance
     String name;
     int age;
    public Person()
    {
        name="No Name";
        age=0;
        System.out.println(name);
    }

     public Person(String name)
     {
         System.out.println(name+age);
     }
     public Person(Person Person2)
     {
         this.name= Person2.name;
         this.age=Person2.age;

     }
     public void disply()
     {
         System.out.println(name+age);

     }
}
public class Main {

    public static void main(String[] args) {

        Person Person1=new Person();
        Person Person2=new Person("mahdi");
        Person Person3=new Person(Person2);
        Person3.disply();



    }
}
