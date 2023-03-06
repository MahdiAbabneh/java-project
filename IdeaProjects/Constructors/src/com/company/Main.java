package com.company;

public class Main {

    public static void main(String[] args) {
        Account account1=new Account();
        Account account2=new Account("1",500.0,"mahdi",
                "mahdgi@mail.com","078*******");
        System.out.println(account2.getNumber());
        System.out.println(account2.getBalance());
        System.out.println(account2.getCustomerName());
        System.out.println(account2.getCustomerEmailAddress());
        System.out.println(account2.getCustomerPhoneNumber());
        Account account3=new Account("2","***","078******8");
    }
}
