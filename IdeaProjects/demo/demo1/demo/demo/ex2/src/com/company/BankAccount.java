package com.company;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        synchronized (this) {
            balance =balance+amount;
        }
        System.out.println("balance(deposit)= " +balance);
    }

    public void withdraw(double amount) {
        synchronized (this) {
            balance =balance-amount;
        }
        System.out.println("balance(withdraw)= " +balance);
    }
}

