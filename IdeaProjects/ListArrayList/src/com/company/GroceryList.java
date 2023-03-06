package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String>groceryList=new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size()+ " items in your groceryList:");
        for (int i=0 ;i<groceryList.size();i++)
        {
            System.out.println((i+1)+ ". " +groceryList.get(i));
        }
        System.out.println("GroceryList= "+groceryList);
    }
    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("GroceryItem "+(position+1)+" has been modified");
    }
    public void removeGroceryItem(int position){
        String theItem=groceryList.get(position);
        groceryList.remove(position);
        System.out.println("GroceryItem "+(position+1)+" has been remove");
    }
    public String findItem(String searchItem){
        boolean exists=groceryList.contains(searchItem);
        if(exists)
            return " the item is found: "+searchItem;
        else
            return "not found item";
    }
}
