package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int count = 0;
        while (true)
        {
            boolean hasNextInt=scanner.hasNextInt();
            if (hasNextInt)
            {
                int number = scanner.nextInt();
                sum=sum+number;
                count++;
            }
            else if(count==0)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        long avg=(int)Math.round((double) sum/count);
        System.out.println("SUM = " + sum + " AVG = " + avg +"");
        scanner.close();
    }
}
