package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printCubesOfOddNumbersInListFunctional(numbers);

    }

    private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream() // Convert to Stream
                .filter(number -> number % 2 != 0) // Lambda Expression
                //.map (number -> number * number * number)
                .forEach(System.out::println);// Method Reference



    }
}
