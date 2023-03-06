package com.company;
//interface
interface Name
{
    public String getName();
}
class Print implements Name {
    String name;

    public String getName() {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {
	Print p=new Print();
    p.name="mahdi";
    System.out.println(p.getName());
    }
}
