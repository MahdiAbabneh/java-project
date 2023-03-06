package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> number=new HashSet<Integer>();
        number.add(100);
        number.add(20);
        number.add(30);
        System.out.println(number);

        for (int i=0;i<number.size();i++)
        {
            if (number.contains(20))//bool
            {
                System.out.println("the value is found");
                i=number.size();
                i++;
            }
            else
                System.out.println("the value not found");
        }
    }
}
