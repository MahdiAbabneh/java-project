package com.company;

public class Cube extends Shape{
    public Cube(Key key) {
        super(key);
    }

    @Override
    public void getDescription() {
        System.out.println("Hey, I am a Cube, I increase power by " + this.key.getBehaviour() );
    }
}
