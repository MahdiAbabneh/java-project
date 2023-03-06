package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number)
    {
        if(number<0||number<=1)
            return -1;
        else
        {
            int largPrime=2;
            if(largPrime<number)
            {
                if(number%largPrime!=0)
                {
                    largPrime=largPrime+1;
                }
                else {
                    number=number/largPrime;
                }
            }
        }
        return number;
    }
}
