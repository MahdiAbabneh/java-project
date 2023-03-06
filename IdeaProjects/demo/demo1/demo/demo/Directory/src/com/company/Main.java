package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        try {
            Path path= Paths.get("data");
            if(Files.exists(path))
            {
                System.out.println("Directory is already exists");
            }
            else
            {
                Path path1=Files.createDirectories(path);
                System.out.println("Directory is created"+path1.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileWriter fw=new FileWriter("data"+File.separator+"input.txt");
            fw.write("Welcome team");
            fw.close();
        }
        catch(Exception e)
        {System.out.println(e);}
        System.out.println("Success...");

        System.out.println("File.separator = "+File.separator);
        System.out.println("File.separatorChar = "+File.separatorChar);
        System.out.println("File.pathSeparator = "+File.pathSeparator);
        System.out.println("File.pathSeparatorChar = "+File.pathSeparatorChar);
    }
    }



