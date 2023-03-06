package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int num = number;
            int remainder = 0;
            int sum = 0;
            while (num > 0) {
                remainder = num % 10;
                if(remainder % 2 == 0) {
                    sum = sum + remainder;
                }
                num =num/ 10;
            }
            return sum;
        }




    }
}
