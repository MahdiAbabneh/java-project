package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input your name");
        String name= scanner.nextLine();
        System.out.println("input your birth");
        boolean hasNextInt=scanner.hasNextInt();
        if(hasNextInt)
        {
            int birth=scanner.nextInt();
            int age=2022-birth;
            if(age>0&&age<100)
            {
                System.out.println("your name: "+name+" and you have: "+age+"year");
            }
            else
            {
                System.out.println("invalid birth");
            }
        }
        else
        {
            System.out.println("invalid birth");
        }
        scanner.close();


    }
}
