package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        try
        {


            Path path= Paths.get("C:\\Users\\user1\\IdeaProjects\\demo\\demo1\\demo\\demo\\ Exists File\\data.txt");
            Path p= Files.createDirectory(path);
            //System.out.println("Directory has been created at "+p.toString());


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
