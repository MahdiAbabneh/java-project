package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i=0;i<5;i++)
        {
            System.out.println("How are you"+i);
        }

        for(int i=0;i<=100;i++)
        {
            if (isPrime(i))
            {
                System.out.println("number:"+i+" is prime number");

            }
        }


    }
    public static boolean isPrime(int number)
    {
        if (number==0)
        {
            return false;
        }
        for (int i=2;i<=number/2;i++)
        {
            if(number%2==0)
                return false;
        }
        return true;
    }
}
