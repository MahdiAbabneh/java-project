package com.company;
class FirName
{
    String name1;

    class SacName //Inner Classes
    {
        public void fun()
        {
            System.out.println(name1+"ababneh");
        }
    }
    public void print()
    {
        SacName sacName=new SacName();
        sacName.fun();

    }
}

public class Main {

    public static void main(String[] args) {
	FirName firName=new FirName();
    firName.name1="mahdi";
    firName.print();
    }
}
