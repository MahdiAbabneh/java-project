package com.company;

import java.io.Serializable;

public class Student implements Serializable {
    private String studName;
    private String studBranch;

    public Student(String studName, String studBranch) {
        this.studName = studName;
        this.studBranch = studBranch;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studName='" + studName + '\'' +
                ", studBranch='" + studBranch + '\'' +
                '}';
    }
}
