package com.company;

public class Main {

    public static void main(String[] args) {

        Sandwich basicSandwich=new BasicSandwich();
        Sandwich PotatoSandwich=new Potato(new Salt(new BasicSandwich()));
        Sandwich ChickenSandwich = new Salt(new Potato(new Chicken(new BasicSandwich())));

        System.out.println("Description: "+basicSandwich.getDescription());
        System.out.println("Cost: "+basicSandwich.getCost() + "$ ");

        System.out.println("Description: "+PotatoSandwich.getDescription());
        System.out.println("Cost: "+PotatoSandwich.getCost() + "$ ");

        System.out.println("Description: "+ChickenSandwich.getDescription());
        System.out.println("Cost: "+ChickenSandwich.getCost() + "$ ");

    }
}
