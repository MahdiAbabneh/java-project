package com.company;

public class Main {

    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
      //  System.out.println(lazySingleton1.hashCode());
        lazySingleton1.printData();
        // System.out.println(lazySingleton2.hashCode());
        lazySingleton2.printData();

    }
}
