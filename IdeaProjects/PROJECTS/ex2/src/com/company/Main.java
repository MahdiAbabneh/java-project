package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices"
                ,"AWS", "PCF","Azure", "Docker", "Kubernetes");

        courses.stream()
               // .filter(course->course.contains("Spring"))
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);

    }
}
