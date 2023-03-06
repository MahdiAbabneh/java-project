package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("enter your text ");
        String text = input.nextLine();
        switch (text) {
            case "start":
                System.out.println("the car is start");

            case "stop":
                System.out.println("the car is stop");
                break;
            default:
                System.out.println("the car is not run");
        }
        printDayOfTheWeek(5);


    }
    public static void printDayOfTheWeek(int day)
    {
        switch (day)
        {

            case 1:System.out.println("SUNDAY");
            break;
            case 2:System.out.println("MONDAY");
            break;
            case 3:System.out.println("TUESDAY");
            break;
            case 4:System.out.println("WEDNESDAY");
            break;
            case 5:System.out.println("THURSDAY");
            break;
            case 6:System.out.println("FRIDAY");
            break;
            case 7:System.out.println("SATURDAY");
            break;
            default:System.out.println("Invalid day");
        }

    }
}
