package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        //Reading Files With File Reader
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\user1\\IdeaProjects\\demo\\demo1\\demo\\demo\\FileWriter1\\Output1.txt"));
            String data;
            while ((data=bufferedReader.readLine())!=null)
            {
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File file2 =new File("OutPut2.txt");
            FileWriter fileWriter=new FileWriter(file2);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Hi, Cyber_Solution");
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
