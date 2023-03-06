package com.company;
class A
{
    String name_person;
    int age_person;

}
class B extends A //Single Inheritance
{
    String name_car;
    int model_car;
    public void disply()
    {
        System.out.println(name_person+age_person+name_car+model_car);
    }
}
 class C extends B // Multilevel Inheritance
{
    String work;
    int salary;

}
/* Hierarchical Inheritance
class A {}
class B extends A{}
class C extends A{}
*/
public class Main {

    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        b.name_person="mahdi";
        b.age_person=23;
        b.model_car=2019;
        b.name_car="BMW";
        b.disply();


    }
}
