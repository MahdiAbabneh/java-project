package com.company;

public class Main {

    public static void main(String[] args) {

        InterpreterEngine interpreterEngine = new InterpreterEngine();

        //Create an Instance of InterpreterClient
        InterpreterClient interpreterClient = new InterpreterClient(interpreterEngine);

        System.out.println("Addition of both Number is = " + interpreterClient.interpret("add 300 and 75"));
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Subtraction of number is = " + interpreterClient.interpret("subtract 40 from 100"));
    }
}
