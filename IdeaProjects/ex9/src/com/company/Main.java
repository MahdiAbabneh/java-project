package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);

    }
    public static void printYearsAndDays(long minutes)
    {
        if (minutes<0)
            System.out.println("Invalid Value");
        else
        {
            long years;
            years=minutes/525600;
            long minutesRun;
            minutesRun=minutes-(years*525600);
            long days;
            days=minutesRun/1440;
            System.out.println(minutes+ " min = "+years+" y and "+days+" d");
        }

    }

}
