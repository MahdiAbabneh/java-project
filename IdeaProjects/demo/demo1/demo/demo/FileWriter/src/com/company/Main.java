package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try{
            FileWriter fw=new FileWriter("testout.txt");
            fw.write("Welcome to javaTpoint.");
            fw.write("hiiiii");
            fw.write(5);
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
        try {
            File file1=new  File("Output1.txt");
            PrintWriter printWriter=new PrintWriter(file1);
            printWriter.println("hi");
            printWriter.println("hiiiii");
            printWriter.println("jhhjhhjj");

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
