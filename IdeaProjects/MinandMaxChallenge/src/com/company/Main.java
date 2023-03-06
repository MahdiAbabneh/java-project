package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int min=0;
        int max=0;
            while (true){
                System.out.println("Enter number: ");
                boolean hasNextInt=scanner.hasNextInt();
                if (hasNextInt) {
                    int number = scanner.nextInt();
                    if (number>max)
                    {
                        max=number;
                    }
                    if(number<min)
                    {
                        min=number;
                    }
                } else {
                    System.out.println("invalid value");
                    break;
                }

            }
        System.out.println("Max= "+max);

    }
}
