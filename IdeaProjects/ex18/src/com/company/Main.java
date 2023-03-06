package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,99));

    }
    public static boolean hasSharedDigit(int number1,int number2)
    {
        if((number1>=10&&number1<=99)&&(number2>=10&&number2<=99))
        {
            int starttnumber1=number1/10;
            int lastnumber1=number1%10;
            int starttnumber2=number2/10;
            int lastnumber2=number2%10;
            if(starttnumber1==starttnumber2||starttnumber1==lastnumber2||lastnumber1==starttnumber2||lastnumber1==lastnumber2)
            {
                return true;
            }

        }
        else
        {
            return false;
        }
            return false;
    }
}
