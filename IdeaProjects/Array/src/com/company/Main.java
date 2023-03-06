package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Arrays of Strings
        String [] name=new String[2];
        name[0]="ahmad";
        name[1]="mahdi";
        System.out.println(name[0]);

        int [] number={1,2,3,4,5};//initialize Array inline
        System.out.println(number[4]);
        int []num=new int[5];
        for (int i=0;i<num.length;i++)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("plz input your number in index "+i+" : ");
            num[i]=scanner.nextInt();
        }
        System.out.println("size="+num.length);
        System.out.println("num[3]= "+num[3]);
    }
}
