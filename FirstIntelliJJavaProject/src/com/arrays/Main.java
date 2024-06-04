package com.arrays;

public class Main {

    public static void main(String[] args) {
        int[] rollnos; //declaration of rollnos array in stack memory
        rollnos = new int[5]; // initialization of rollnos in heap memory, actual memory will be allocated here
        // and all the values will be default value of the datatype of the array.
        System.out.println(rollnos[0]); // o/p will be zero for int the default value is 0

        String[] arr = new String[4];
        System.out.println(arr[1]); // o/p will be null, because the default value of String is null

    }
}
