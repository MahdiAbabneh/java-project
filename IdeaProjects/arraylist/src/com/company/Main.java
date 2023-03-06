package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(10); //index 0
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        System.out.println(number.size());
        System.out.println(number);
        System.out.println(number.get(3));  // index 3 =40
        System.out.println(number.set(3,100)); // in index 3 the value will be 100
        System.out.println(number.get(3));
        System.out.println(number.remove(4)); //remove 50
        number.clear(); // remove all arraylist

        // *************************************************************************************

        ArrayList<Integer> numbers=new ArrayList<Integer>(2);
        for (int i=0;i<=2;i++)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("input your number"+"index="+i);
            int nums=scanner.nextInt();
            numbers.add(nums);
        }
        System.out.println(numbers);




    }
}
