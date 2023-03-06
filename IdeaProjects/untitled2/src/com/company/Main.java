package com.company;

import java.util.Scanner;

public class Main {
public void rahul ( ) {}
    public static void main(String[] args) {
	// While loops

        int value=1;
        while (value<5)
        {
            System.out.println("Hi"+" "+value);
            //value=value+1;
            value++;
        }

    // For loops

        for (int i=0;i<5;i++)
        {
            System.out.println("How are you"+i);
        }
    // if

        Scanner input=new Scanner(System.in);
        System.out.println("Plz-input-Yours mark");
        int mark=input.nextInt();
        if (mark>50){
            System.out.println("pass");
        }
        else
        {
            System.out.println("fil");
        }
    // else if

        System.out.println("Plz-input-Yours mark");
        int Mark=input.nextInt();
        if(Mark>=90)
        {
            System.out.println("excellent");
        }
        else if (Mark>=80||Mark<=89)
        {
            System.out.println("good");
        }
        else if (Mark>=60||Mark<=50)
        {
            System.out.println("bad");
        }
        // do While loops

        int x=1;
        do
        {
            System.out.println("Hi"+" "+x);
            //value=value+1;
            x++;
        }
        while (x>2);
        //Switch

        //Scanner input=new Scanner(System.in);
        System.out.println("enter your text ");
        String text=input.nextLine();
        switch (text)
        {
            case "start":System.out.println("the car is start");

            case "stop":System.out.println("the car is stop");
                break;
            default:System.out.println("the car is not run");
        }


    }}
