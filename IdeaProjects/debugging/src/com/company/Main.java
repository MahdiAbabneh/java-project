package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("insert your number");
        int x=scanner.nextInt();
        System.out.println("insert your number");
        int y=scanner.nextInt();
        int sum=x+y;
        System.out.println(sum);
        if (sum>10)
        {
            System.out.println("H1");
        }
        else if (sum<10&&sum!=0)
        {
            System.out.println("H2");
        }
        else
        {
            System.out.println("Nothing");
        }
    }
}
