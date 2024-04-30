package com.switchstatements;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruit");
            case "apple" -> System.out.println("Sweet red apples");
            case "orange" -> System.out.println("Round fruit");
            default -> System.out.println("Default");
        }
    }
}
