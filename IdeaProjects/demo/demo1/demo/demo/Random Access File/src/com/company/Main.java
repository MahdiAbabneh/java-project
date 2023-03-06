package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class Main {

    public static void main(String[] args)throws IOException {
        RandomAccessFile randomAccessFile=new RandomAccessFile("mahdi.txt","rw");
        randomAccessFile.writeUTF("welcom");
        randomAccessFile.writeChar('b');
        randomAccessFile.writeChar('c');
        randomAccessFile.writeChar('d');
        randomAccessFile.writeChar('e');
        randomAccessFile.writeChar('f');
        RandomAccessFile randomAccessFile1=new RandomAccessFile("mahdi.txt","r");
        randomAccessFile1.seek(4);
        System.out.println(randomAccessFile1.readChar());
        System.out.println(randomAccessFile.length());
        randomAccessFile.close();







    }
}
