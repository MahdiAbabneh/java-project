package com.company;

public class Main {


    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes ){
        if (kiloBytes<0)
            {
                System.out.println("invalid value");
            }
        else
            {
                int megaBytes;
                megaBytes=kiloBytes/1024;
                int remainder;
                remainder=kiloBytes%1024;
                System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainder+" KB");
            }
    }
}

