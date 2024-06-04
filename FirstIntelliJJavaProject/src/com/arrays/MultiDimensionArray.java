package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {

    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // adding no of columns is not mandatory. Because we can have variable number of columns
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { //arr[i].length will also work for variable length 2d array
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
