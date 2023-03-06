package com.company;

import java.util.List;
import java.util.function.Supplier;

public class Main {
    private static void print(String str) {
        System.out.println(str);
    }


    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker",
                "Kubernetes");

        courses.stream()
                //.map(str -> str.toUpperCase())
                .map(String::toUpperCase)
                .forEach(Main::print);

    }
}
