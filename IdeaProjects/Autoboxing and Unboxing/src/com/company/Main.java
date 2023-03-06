package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int num=50;
        Integer num2= num; //autoboxing  Integer.valueOf(num);

        Integer myIntValue = 56; //unboxing myIntValue.intValue();
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + "  --> " + value);
        }
    }}
