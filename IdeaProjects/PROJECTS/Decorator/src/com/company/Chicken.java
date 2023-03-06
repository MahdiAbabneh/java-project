package com.company;

public class Chicken extends SandwichDecorator{
    public Chicken(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Chicken ";
    }

    @Override
    public double getCost() {
        return super.getCost()+8.0;
    }
}
