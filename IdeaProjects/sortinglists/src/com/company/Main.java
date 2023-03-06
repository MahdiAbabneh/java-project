package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> name =new ArrayList<String>();
        name.add("M");
        name.add("A");
        name.add("Z");
        name.add("S");
        name.add("B");
        Collections.sort(name);
        System.out.println(name);
        Collections.reverse(name);
        System.out.println(name);

    }
}
