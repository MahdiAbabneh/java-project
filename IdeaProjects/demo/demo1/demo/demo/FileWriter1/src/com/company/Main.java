package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("testout.txt");
            fw.write("Welcome team");
            fw.close();
        }
        catch(Exception e)
        {System.out.println(e);}
        System.out.println("Success...");


        try {
            FileReader fileReader=new FileReader("C:"+File.separator + "Users\\user1\\IdeaProjects\\demo\\demo1\\demo\\demo\\FileWriter1\\testout.txt");
            System.out.println(fileReader.read());
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file1=new  File("output.txt");
            PrintWriter printWriter=new PrintWriter(file1);
            printWriter.println("hi");
            printWriter.println("hiiiii");
            printWriter.println("jhhjhhjj");
            printWriter.close();
        }
        catch(Exception e)
        {System.out.println(e);}

        System.out.println("Success...");

        try {

            //Reading Files Using Scanner

            File file=new File("C:\\Users\\user1\\IdeaProjects\\demo\\demo1\\demo\\demo\\FileWriter1\\testout.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("File.separator = "+File.separator);
        System.out.println("File.separatorChar = "+File.separatorChar);
        System.out.println("File.pathSeparator = "+File.pathSeparator);
        System.out.println("File.pathSeparatorChar = "+File.pathSeparatorChar);
    }
}
