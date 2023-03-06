package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,String> name=new HashMap<>(); // <key,value>
        name.put("mahdi","ababneh");
        name.put("yazan","mohmeead");
        name.put("ahmad","abeed");
        name.replace("mahdi","ababneh","mmmm");
        System.out.println(name.size());
        System.out.println(name.keySet());
        System.out.println(name.values());
        System.out.println(name.get("mahdi"));//get(key)
        name.remove("ahmad");
        System.out.println(name);
        name.clear();//remove the all
        System.out.println(name);


        //********************************************************************

        HashMap<String,Integer> NameAge=new HashMap<>();
        NameAge.put("Mahdi",23);
        NameAge.put("ahmad",25);
        NameAge.put("yazan",25);





    }
}
