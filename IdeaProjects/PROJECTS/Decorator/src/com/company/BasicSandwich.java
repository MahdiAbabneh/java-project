package com.company;

public class BasicSandwich implements Sandwich{
    @Override
    public String getDescription() {
        return "Bread";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
