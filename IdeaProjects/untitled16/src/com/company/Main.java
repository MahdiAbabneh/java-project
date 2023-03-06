package com.company;
//enum
enum Gender {male,female}
enum Course{arabic,english}
class RegForm
{
    String name;
    Gender person;
    Course cor;
}

public class Main {

    public static void main(String[] args) {
	Gender gender=Gender.female;
    Course course1=Course.arabic;
    Course course2=Course.english;

    }
}
