package com.company;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDaysInMonth(4,2020));
    }
    public static boolean isLeapYear(int year)
    {
        if((year>=1) && (year<=9999)) {
            if (year % 4 == 0)
            {
                if  (year % 100 == 0)
                {
                    if (year % 400 == 0)
                    {
                        return true;
                    }
                    else
                        return false;
                }
                else
                    return true;
            }
        }
        else
        {
            System.out.println("is not in range (1-9999)");
            return false;
        }
        return false;
    }
    public static int getDaysInMonth(int month,int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        int numDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 2:
                if (isLeapYear(year))
                {
                    numDays = 29;
                    break;
                }
                numDays=28;
                break;
            case 4:
            case 6:
            case 11:
            case 9:
                numDays = 30;
                break;
            default:
                numDays = -1;
        }
        return numDays;


    }
}
