package com.shivhshankar;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int result = 0;
        while(num>0){
            int rem = num % 10;
            result = (result*10)+rem;
            num /= 10;
        }
        System.out.println(result);
    }
}
