package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreadSafeSingleton {

    private String[] LETTERS = { "a", "b", "c", "d", "e"};

    private List<String> data = Arrays.asList(LETTERS);

    private static  ThreadSafeSingleton instance;

    private static boolean delayMe = true;

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
                if(instance == null) {
                    if(delayMe) {
                        delayMe = false;
                        Thread.currentThread();
                        try {Thread.sleep(1000);}catch (InterruptedException ie){}
                    }
                    instance = new ThreadSafeSingleton();
                }


        }
        return instance;
    }
    private ThreadSafeSingleton() {
        Collections.shuffle(data);

    }

    public void printData() {
        for(String item: data) {
            System.out.printf("%s ", item);

        }
        System.out.println();

    }
}
