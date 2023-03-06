package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Shop
{
    int product;
    int stoke;
    String name;
    Shop(int product,int stoke,String name)
    {
        this.product=product;
        this.stoke=stoke;
        this.name=name;
    }

}
class StokeComparator implements Comparator<Shop>
{

    @Override
    public int compare(Shop s1, Shop s2) {
        if (s1.stoke==s2.stoke) //if we want to compare name s1.name.CompareTo(s2.name)
            return 0;
        else if (s1.stoke>s2.stoke)
            return +1;
        else
            return -1;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Shop> s=new ArrayList<Shop>();
        s.add((new Shop(10,60,"M")));
        s.add((new Shop(30,15,"A")));
        s.add((new Shop(50,5,"S")));

        for (Shop shop:s)
        {
            System.out.println("product:"+shop.product+" "+"stoke:"+ shop.stoke+" "+ "name:"+shop.name);
        }
        Collections.sort(s,new StokeComparator());

        for (Shop shop:s)
        {
            System.out.println("product:"+shop.product+" "+"stoke:"+ shop.stoke+" "+ "name:"+shop.name);
        }


    }
}
