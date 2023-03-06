package com.company;

import java.util.Random;
import java.util.function.*;

public class Main {

    //IntBinaryOperator
    //IntConsumer
    //IntFunction
    //IntPredicate
    //IntSupplier
    //IntToDoubleFunction
    //IntToLongFunction
    //IntUnaryOperator

    public static void main(String[] args) {

        //No input > Return Something
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };

        System.out.println(randomIntegerSupplier.get());

        UnaryOperator<Integer> unaryOperator = x -> 3 * x;
        System.out.println(unaryOperator.apply(10));

        BiPredicate<Integer, String> biPredicate = (number, str) -> {
            return number<10 && str.length()>5;
        };

        System.out.println(biPredicate.test(10, "in28minutes"));

        BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };

        biConsumer.accept(25, "in28Minutes");


        BinaryOperator<Integer> sumBinaryOperator2 = (x, y) -> x + y;
        System.out.println(sumBinaryOperator2.apply(2,5));

        IntBinaryOperator intBinaryOperator = (x,y) -> x + y;
       // BinaryOperator<Integer> intBinaryOperator = Integer::sum;
        System.out.println(intBinaryOperator.applyAsInt(5,9));

        IntToDoubleFunction intToDoubleFunction=(x)->x;
        System.out.println(intToDoubleFunction.applyAsDouble(2));

        IntToLongFunction intToLongFunction=(x)->x;
        System.out.println(intToLongFunction.applyAsLong(500000000));


    }
}
