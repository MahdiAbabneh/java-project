package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"name1");
        map.put(6,"name6");
        map.put(7,"name7");
        map.put(8,"name7");
        map.put(1,"name5");
        System.out.println(map);
        if(map.containsKey(1))
        {
            System.out.println("the key (1) is already in the map");
        }
        else
            map.put(1,"mahdi");
        System.out.println(map);

        Set<Integer> set=new HashSet<Integer>();
        set.add(2);
        set.add(1);
        set.add(1);
        set.add(3);
        System.out.println(set);

    }
}
