package com.company;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> name = new LinkedHashSet<>();
        name.add("mahdi");
        name.add("mahomaahd");
        name.add("yazan");
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value == "mahdi")
                iterator.remove();
            else
                System.out.println(value);
        }
    }
}
