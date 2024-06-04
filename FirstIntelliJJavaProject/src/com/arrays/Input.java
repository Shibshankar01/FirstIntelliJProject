package com.arrays;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 32;
        arr[2] = 45;
        arr[3] = 54;
        arr[4] = 56;
//        System.out.println(arr[5]);

        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
