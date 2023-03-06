package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        // Reading from a file
        try {
            FileInputStream in=new FileInputStream("C:\\Users\\user1\\IdeaProjects\\demo\\demo1\\demo\\demo\\Byte Streams\\ Wikipedia.txt");
            FileOutputStream out=new FileOutputStream("NewWikipedia.txt");
            int i;
            while ((i=in.read())!=-1)
            {
                out.write(i);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading from console

        BufferedInputStream read = new BufferedInputStream(System.in);

        try {
            System.out.print("Enter any character: ");
            char c = (char)read.read();
            System.out.println("You have entered '" + c + "'");
        }
        catch(Exception e) {
            System.out.println(e);
        }
            try {
                read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}
