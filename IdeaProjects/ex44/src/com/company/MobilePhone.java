package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact>myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts=new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact){
        if(myContacts.contains(contact)){
            System.out.println(" the contact already exists.");
            return false;
        }
        else{
            myContacts.add(contact);
            System.out.println(contact.getName()+" was add.");
            return true;
        }
    }
    public boolean  updateContact(Contact oldContact,Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            myContacts.set( position, newContact);
            System.out.println("  updated successfully" );
            return true;
        }else {
            System.out.println("the contact doesn't exists" );
            return false;
        }
    }
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position >= 0){
            myContacts.remove(position);
            System.out.println(" removed successfully");
            return true;
        }else {
            System.out.println("the contact doesn't exists" );
            return false;
        }
    }
    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    public int findContact(String name){
        for (int i=0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return myContacts.get(position);
        }else {
            return null;
        }
    }



    public void printContacts(){
        for (int i=0; i < myContacts.size(); i++){
            System.out.println(myContacts.get(i).getName() + " : " + myContacts.get(i).getPhoneNumber());
        }
    }

}
