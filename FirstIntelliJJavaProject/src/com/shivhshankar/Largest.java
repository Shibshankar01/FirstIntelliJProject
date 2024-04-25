package com.shivhshankar;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(Math.max(i, Math.max(j, k)));
    }
}
