package com.company;

public class Salt extends SandwichDecorator{
    public Salt(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " Salt ";
    }

    @Override
    public double getCost() {
        return super.getCost()+0.5;
    }
}
