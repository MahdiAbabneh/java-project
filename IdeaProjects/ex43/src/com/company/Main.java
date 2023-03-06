package com.company;

import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            int[] array = {1,2,3,4,5,6};
            int[] reversedArray = reverseArray(array);
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(reversedArray));
        }

    public static int[] reverseArray(int[] array){
        int[] reverseArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reverseArray[(reverseArray.length - 1) - i] = array[i];
        }
        return reverseArray;
    }
    }

