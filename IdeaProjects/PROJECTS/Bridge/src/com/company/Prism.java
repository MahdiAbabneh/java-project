package com.company;

public class Prism extends Shape{
    public Prism(Key key) {
        super(key);
    }

    @Override
    public void getDescription() {
        System.out.println("Hey, I am a Prism, I increase speed by " + this.key.getBehaviour() );

    }
}
