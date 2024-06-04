package com.questions;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(max(arr));
        System.out.println(maxBetweenIndex(arr, 0, 3));
    }

    public static int max(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int maxBetweenIndex(int[] arr, int index1, int index2){
        int max = 0;
        for (int i = index1; i < index2; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}
