package com.company;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class App {
    public static String[] vehicles = {"ambulance", "helicopter", "lifeboat"};
    public static String[][] drivers = {
            {"Fred", "Sue", "Pete"},
            {"Sue", "Richard", "Bob", "Fred"},
            {"Pete", "Mary", "Bob"},};
         }

public class Main {

    public static void main(String[] args) {
        Map<String, Set<String>> person = new HashMap<String, Set<String>>();
        for (int i = 0; i < App.vehicles.length; i++)
        {
            String vehicle = App.vehicles[i];
            String[] driversList = App.drivers[i];
            Set<String> driverSet = new LinkedHashSet<String>();
            for (String driver : driversList)
            {
                driverSet.add(driver);
            }
            person.put(vehicle, driverSet);
        }
        System.out.println(person);
        System.out.println(person.keySet());
        System.out.println(person.values());
    }

}
