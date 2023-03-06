package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int countValid=0;
        int count=1;
        boolean hasNextInt=true;
        for (int i=1;i<=10;i++)
        while (hasNextInt&&i<=10){
                System.out.println("Enter number: " + i);
                i++;
            scanner.hasNextInt();
                int number = scanner.nextInt();
                if (number >= 0) {
                    sum = sum + number;
                } else {
                    System.out.println("invalid value");
                    countValid++;
                }

        }
        System.out.println("Sum= "+sum);
        System.out.println("countValid="+countValid);

    }

}
