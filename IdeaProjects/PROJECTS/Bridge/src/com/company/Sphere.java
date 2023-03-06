package com.company;

public class Sphere extends Shape{
    public Sphere(Key key) {
        super(key);
    }

    @Override
    public void getDescription() {
        System.out.println("Hey, I am a Sphere, I increase health by " + this.key.getBehaviour() );

    }
}
