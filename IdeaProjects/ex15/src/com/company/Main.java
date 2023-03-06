package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(707));

    }
    public static boolean isPalindrome(int number)
    {
        number=Math.abs(number);
        int n=number;
        int reverse=0;
        int lastDigit=0;
        while (n>0)
        {
            lastDigit=n%10;
            n=n/10;
            reverse=(reverse*10)+lastDigit;
        }
        if (number==reverse)
        {
            return true;
        }
        else
            return false;
    }
}
