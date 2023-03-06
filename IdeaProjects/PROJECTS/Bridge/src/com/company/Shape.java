package com.company;

public abstract class Shape {
     Key key;

    public Shape(Key key) {
        this.key = key;
    }

    public abstract void getDescription();
}
