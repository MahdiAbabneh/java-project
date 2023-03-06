package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Enter the amount values you want in an Array");
            int count = scanner.nextInt();
            System.out.println("Enter the " + count + " Integers");
            int[] array = readElements(count);
            System.out.println(Arrays.toString(array));
            System.out.println("The minimum element in the array is: " + minimumElement(array));
        }

        public static int[] readElements(int count) {
            int[] array = new int[count];
            for (int i = 0; i < count; i++) {
                array[i] = scanner.nextInt();
            }
            return array;
        }

        public static int minimumElement(int[] array) {

            int minValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if (minValue > array[i]) {
                    minValue = array[i];
                }
            }
            return minValue;
        }


    }
