package com.company;


public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Student student) {

        if(this.id>student.id)
            return 1;
        else if (this.id<student.id)
            return -1;
        else
            return 0;
    }
}



