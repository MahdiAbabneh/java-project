package com.company;
//Recursion
class Sum
{
    public int sumNum(int num)
    {
        if(num==0)
            return 0;
        else
            return sumNum(num-1)+num;

    }
}

public class Main {

    public static void main(String[] args) {
	Sum sum=new Sum();
    System.out.println(sum.sumNum(10));
    }
}
