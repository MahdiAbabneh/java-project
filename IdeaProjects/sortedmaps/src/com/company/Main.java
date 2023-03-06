package com.company;


import java.util.Map;
import java.util.TreeMap;


public class Main {


    public static void main(String[] args) {
        Map<Integer, String> NumAndName = new TreeMap<Integer,String>();
        MapTest(NumAndName);
    }
    public static void MapTest(Map<Integer,String> map)
    {
        map.put(3,"name");
        map.put(0,"name");
        map.put(2,"name");
        map.put(1,"name");
        map.put(4,"name");
        System.out.println(map);

    }


}
