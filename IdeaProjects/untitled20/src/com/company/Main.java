package com.company;
interface Man
{
    public void fun();
}


public class Main {

    public static void main(String[] args) {
        Man man= new Man() {

            public void fun()
            {
                System.out.println("man");
            }

        };
        man.fun();

    }
}

