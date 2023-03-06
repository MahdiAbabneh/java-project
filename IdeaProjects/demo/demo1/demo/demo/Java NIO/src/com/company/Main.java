package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        try
        {
            //Writing with List of String
            Path path1= Paths.get("data1.txt");

            List list=new ArrayList<>();


            list.add("mahdi");
            list.add("ahmad");
            list.add("yazn");
            list.add("sadas");
            list.add("kkkk");
            list.add("www");


            Files.write(path1, list);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            Path path=Paths.get("C:\\Users\\user1\\IdeaProjects\\demo\\demo1\\demo\\demo\\Java NIO\\data1.txt");
            List<String> data= Files.readAllLines(path);

            for(String s:data)
            {
                System.out.println(s);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
