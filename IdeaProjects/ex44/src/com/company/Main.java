package com.company;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("1234567890");
    public static void main(String[] args) {
        System.out.println("Mobile Phone Menu");
        boolean flag = true;
        printInstructions();
        while (flag){
            System.out.println("Enter a choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){ case 1:
                addContact();
                continue; case 2:
                updateContact();
                continue; case 3:
                removeContact();
                continue; case 4:
                findContact();
                continue; case 5:
                System.out.println("Print Contact");
                mobilePhone.printContacts();
                continue; case 6:
                printInstructions();
                continue; case 7:
                System.out.println("Quit Menu");
                flag = false;
                break;
                default:
                    System.out.println("Invalid Choice, please try again");
            }
        }
    } public static void printInstructions(){
        System.out.println("1 - Add new contact");
        System.out.println("2 - Update contact");
        System.out.println("3 - Remove contact");
        System.out.println("4 - Find contact");
        System.out.println("5 - Show all contacts");
        System.out.println("6 - Show Menu");
        System.out.println("7 - Quit Menu");
    } public static void addContact(){
        System.out.println("Add Contact");
        System.out.println("Add new contact Name");
        String name = scanner.nextLine();
        System.out.println("Add new contact Phone No.");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addNewContact(Contact.createContact(name,phoneNumber));
    }
    public static void updateContact() {
        System.out.println("Update Contact");
        System.out.println("Provide Old Contact name");
        Contact oldContact = mobilePhone.queryContact(scanner.nextLine());
        if(oldContact == null){
            System.out.println("Contact not found");
        }else {
            System.out.println("Contact found");
            System.out.println("Add updated contact Name");
            String updName = scanner.nextLine();
            System.out.println("Add updated contact Phone No.");
            String updPhoneNumber = scanner.nextLine();
            mobilePhone.updateContact(oldContact, Contact.createContact(updName,updPhoneNumber));
        }
    } public static void removeContact(){
        System.out.println("Remove Contact");
        System.out.println("Provide Contact name to remove");
        Contact removeContact = mobilePhone.queryContact(scanner.nextLine());
        if(mobilePhone.removeContact(removeContact)){
            System.out.println(removeContact.getName() + " was removed");
        }else {
            System.out.println("Contact was not found");
        }
    } public static void findContact(){
        System.out.println("Find Contact");
        System.out.println("Provide Contact name to find");
        Contact findContact = mobilePhone.queryContact(scanner.nextLine());
        if(findContact == null){
            System.out.println("Contact not found");
        }else {
            System.out.println(findContact.getName() + " -> " +findContact.getPhoneNumber());
        }
    }
}

