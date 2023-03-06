package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));
    }
    public static boolean hasEqualSum(int number1,int number2,int number3)
    {
        int sum=0;
        sum=number1+number2;
        if (sum==number3)
            return true;
        else
            return false;
    }
}
