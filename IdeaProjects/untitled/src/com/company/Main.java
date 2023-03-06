package com.company;

public class Main {

    public static void main(String args[]) {
        /*
         Primitive Data Type
         Specifies the size & type
         byte      1 byte
         short     2 bytes
         long      8 bytes
         int       4 bytes
         float     4 bytes
         double    8 bytes
         boolean   1 bit
         char      2 bytes
         */

        int IntNumber; //Declared the variable
        IntNumber = 10; //Initialing the variable
        float floatNumber = 5.7f;
        boolean MyBoolean = true;
        char MyChar = 'M';

        System.out.println("IntNumber=" + IntNumber);
        System.out.println("floatNumber=" + floatNumber);
        System.out.println("MyBoolean=" + MyBoolean);
        System.out.println("MyChar=" + MyChar);


        //Not primitive Type
        //They are created by programmers (String,Class,Object,Array,Interface)
        //String

        String MyFirName = "Mahdi";
        String MySecName = "Ababneh";
        String FullName = MyFirName + MySecName;

        System.out.println("MyName:" + MyFirName);
        System.out.println("MySecName:" + MySecName);
        System.out.println("FullName:" + FullName);
        System.out.println("enter your text ");
    }
}
