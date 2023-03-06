package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //Reading Files Using Scanner

        File file=new File("C:\\Users\\user1\\IdeaProjects\\untitled11\\input.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }

        //Reading Files With File Reader

        BufferedReader  bufferedReader=new BufferedReader(new FileReader("C:\\\\Users\\\\user1\\\\IdeaProjects\\\\untitled11\\\\input.txt"));
        String data;
        while ((data=bufferedReader.readLine())!=null)
        {
            System.out.println(data);
        }

        //Creating and Writing Text Files

        File file1 =new File("Out Put.txt");
        FileWriter fileWriter=new FileWriter(file1);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("Hi, Cyber_Solution");
        bufferedWriter.close();

    }
}
