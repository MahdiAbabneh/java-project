package com.company;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	out.println(isLeapYear(-1600));
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
}
