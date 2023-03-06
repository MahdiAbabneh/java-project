package com.company;

public class Main {

    public static void main(String[] args) {

    }


    public class FirstLastDigitSum {
        public static int sumFirstAndLastDigit(int number){

            int sum= 0;
            int firsttDigit=0;
            int sacDigit=0;
            int lastDigit =0;
            firsttDigit=number/10;
            firsttDigit=firsttDigit/10;
            sacDigit=firsttDigit%10;
            lastDigit= number % 10 ;


            if (number>=0)
                return sum= firsttDigit+ lastDigit;
            else {
                return -1;
            }
        }

    }
}
