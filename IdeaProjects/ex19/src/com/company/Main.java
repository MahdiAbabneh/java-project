package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(hasSameLastDigit(999,999,999));
    }
    public static boolean hasSameLastDigit(int n1,int n2,int n3)
    {
        if((n1>=10&&n1<=1000)&&(n2>=10&&n2<=1000)&&(n3>=10&&n3<=1000)) {
            int lstarttnumber1 = n1 / 10;
            int rllastnumber1 = n1 % 10;
            int lstarttnumber2 = n2 / 10;
            int rlastnumber2 = n2 % 10;
            int lstarttnumber3 = n3 / 10;
            int rlastnumber3 = n3 % 10;
            if (rllastnumber1 == rlastnumber2 || rllastnumber1 == rlastnumber3 || rlastnumber2 == rlastnumber3)
            {
                return true;
            }
        }
        else {
                return false;
            }

            return false;



    }
    public static boolean isValid(int number)
    {
        if(number>=10&&number<=1000)
            return true;
        else
            return false;
    }
}
