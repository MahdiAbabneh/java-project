package com.company;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Student
{
    String name;
    int id;
    int avg;
    public Student(String name,int id,int avg)
    {
        this.name=name;
        this.id=id;
        this.avg=avg;
    }

    public String toString()
    {
        return "Student{" + "id:" + id + " " + "name:" + name + " " + "avg:" + avg + "}";
    }
}
    class Classroom implements Iterable<Student>
    {
        List<Student>list=new LinkedList<Student>();
       public Classroom()
       {
           list.add(new Student("mahdi",1,90));
           list.add(new Student("ahmad",2,80));
           list.add(new Student("mousa",3,70));
       }

        @Override
        public Iterator<Student> iterator()
        {
            return list.iterator();
        }
    }
public class Main {

    public static void main(String[] args) {
        Classroom classroom=new Classroom();
        for (Student student:classroom)
        {
            System.out.println(student);
        }
    }
}
