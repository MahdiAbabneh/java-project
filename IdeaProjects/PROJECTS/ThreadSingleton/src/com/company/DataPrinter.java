package com.company;

public class DataPrinter extends Thread {
    @Override
    public void run() {
        ThreadSafeSingleton.getInstance().printData();
    }
}
