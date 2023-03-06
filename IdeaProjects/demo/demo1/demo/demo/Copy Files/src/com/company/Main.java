package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Reading from a file
        try {
            FileInputStream in=new FileInputStream("data.txt");
            FileOutputStream out=new FileOutputStream("newData.txt");
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


    }
}
