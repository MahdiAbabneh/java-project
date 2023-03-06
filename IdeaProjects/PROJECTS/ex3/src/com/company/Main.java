package com.company;

import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
        //BinaryOperator<Integer> sumBinaryOperator = (x,y) => x + y;


        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                // TODO Auto-generated method stub
                return a + b;
            }

        };

        int sum = numbers.stream().reduce(0, sumBinaryOperator);

        System.out.println(sum);

    }


}
