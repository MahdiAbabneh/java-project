package com.company;
class Man
{
    int number;
    String name;
    int age;

    public Man(int number,String name,int age)
    {
       this.number=number;
       this.name=name;
       this.age=age;
    }
    public String toString()
    {
        return "Man[number="+number+"name="+name+"age="+age+"]";
    }
}


public class Main {

    public static void main(String[] args) {
        Man m=new Man(1,"mahdi",23);
        System.out.println(m.toString());






    }
}
