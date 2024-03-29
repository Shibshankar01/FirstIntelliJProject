package com.shivhshankar;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        System.out.println("Hello "+result);

    }
}
