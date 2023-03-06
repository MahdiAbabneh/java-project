package com.company;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

            FileInputStream fileInputStream=new FileInputStream("info.txt");
            DataOutputStream dataOutputStream=new DataOutputStream(fileInputStream);




    }
}
