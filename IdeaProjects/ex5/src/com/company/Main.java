package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
    }
    public static boolean areEqualByThreeDecimalPlaces(double x,double y)
    {
        int num1=(int)(x*1000);
        int num2=(int)(y*1000);
        if (num1==num2)
            return true;
        else
            return false;
    }
}
