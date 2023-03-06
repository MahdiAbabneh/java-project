package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            int [] ahmad=new int[2];
            ahmad[0]=5;
            ahmad[1]=5;
            ahmad[2]=5;
            ahmad[3]=5;
            ahmad[4]=5;


        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
    }

