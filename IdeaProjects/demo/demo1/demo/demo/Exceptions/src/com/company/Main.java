package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Handling Exceptions
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("plz_input_number_one");
            int number1 = input.nextInt();
            System.out.println("plz_input_number_two");
            int number2 = input.nextInt();
            System.out.println(number1/number2);
        }
        catch (Exception ArithmeticException) {
            //System.out.println(ArithmeticException.getMessage());
            System.out.println("you cant division by zero_plz_try_again");

            Scanner input = new Scanner(System.in);
             System.out.println("plz_input_number_one");
            int number1 = input.nextInt();
            System.out.println("plz_input_number_two");
            int number2 = input.nextInt();
            System.out.println(number1/number2);


        }

    }
}
