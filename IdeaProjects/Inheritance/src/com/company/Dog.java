package com.company;

public class Dog extends Animal {
    private int eyes;
    private int tail;
    private int legs;

    @Override
    public void eat() {
        System.out.println("Dog.eat is called");
        //super.eat();
    }
    public void walk()
    {
        move(5);
    }
    public void run()
    {
        move(10);
    }

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int tail, int legs) {
        super(name, brain, body, size,weight);
        this.eyes=eyes;
        this.tail=tail;
        this.legs=legs;


    }
}
