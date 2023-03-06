package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(100,"mahdi",23));
        students.add(new Student(102,"ahmad",25));
        students.add(new Student(4,"lolo",18));
        students.add(new Student(300,"mem",17));
        Collections.sort(students);
        for(Student s:students)
        {
            System.out.println(s.getId());
        }
    }

}


