package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> name=new LinkedList<String>();
        name.add("mahdi");
        name.add("yzan");
        name.add("mohammed");
        System.out.println(name);
        name.removeFirst();
        System.out.println(name);
        System.out.println(name.getLast());
        Collections.sort(name);
        System.out.println(name);


    }
}
