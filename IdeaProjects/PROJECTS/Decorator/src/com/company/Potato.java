package com.company;

public class Potato extends SandwichDecorator{
    public Potato(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" Potato";
    }

    @Override
    public double getCost() {
        return super.getCost()+4.0;
    }
}
