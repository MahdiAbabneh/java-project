package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(0,0,20));
    }
    public static boolean hasTeen(int number1,int number2,int number3)
    {
        if((number1>=13 && number1<=19)||(number2>=13 && number2<=19)||(number3>=13 && number3<=19))

            return true;
        else
            return false;
    }
    public static boolean isTeen(int number)
    {
        if (number>=13&&number<=19)
            return true;
        else
            return false;
    }


}
