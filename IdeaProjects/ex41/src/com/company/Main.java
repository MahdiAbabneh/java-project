package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] array=getIntegers(5);
        System.out.println("before sort");
        printArray(array);
        int[] sortArray=sortArray(array);
        System.out.println("after sort");
        printArray(array);
    }
    private static int[] getIntegers(int number){
        Scanner scanner=new Scanner(System.in);
        int []newArray=new int[number];
        for (int i=0;i<newArray.length;i++)
        {
            System.out.println("plz input your number for index: "+i);
            newArray[i]=scanner.nextInt();
        }
        return newArray;
    }
    private static void printArray(int []array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Element " + i + " = " + array[i]);
        }
    }
    public static int[] sortArray(int[] array) {

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
