package com.company;

import java.util.ArrayList;

interface Draw
{
    public void drawing();
}
interface Add
{
    public int add(int a, int b);
}
interface Name
{
    public String fullName();
}

public class Main {

    public static void main(String[] args) {
        Draw draw = new Draw() {
            @Override
            public void drawing() {
                System.out.println("Hi");
            }
        };
        draw.drawing();

        //Lambda Expressions

        Draw draw1 = () -> {System.out.println("hi1");};
        draw1.drawing();
//----------------------------------------------------------------------------
        Add add_=new Add() {
            @Override
            public int add(int a, int b ) {
                 return a+b;
            }
        };
        System.out.println(add_.add(5,6));

        //Lambda Expressions

        Add add1=(a,b)->{return a+b;};
        System.out.println(add1.add(5,6));

        Add add2=(a,b)->(a-b);
        System.out.println(add2.add(7,5));
//------------------------------------------------------------------------------
        Name name=new Name() {
            @Override
            public String fullName() {
                return "mahdi ababneh";
            }
        };
        System.out.println(name.fullName());

        //Lambda Expressions
        Name name1=()->("mahdi ababneh");
        System.out.println(name1.fullName());











    }
}
