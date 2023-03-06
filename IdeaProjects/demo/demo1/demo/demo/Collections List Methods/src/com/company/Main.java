package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> arrlist = new ArrayList<String>();
        Vector v = new Vector();
//Populate the vector
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
//Create enumeration
        Enumeration e = v.elements();
//Get the list
        arrlist = Collections.list(e);
        System.out.println("Value of returned list: "+arrlist);
        System.out.println("..........................................");
//Create vector and array list
        List<Integer> arrlist1 = new ArrayList<>();
        Vector v1 = new Vector();
//Populate the vector
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
//Create enumeration
        Enumeration en = v1.elements();
//Get the list
        arrlist1 = Collections.list(en);
        System.out.println("Value of returned list: "+arrlist1);
        System.out.println("..........................................");
    }
}
