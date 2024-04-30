package com.switchstatements;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String dept = sc.next();

        switch (empId) {
            case 1 -> System.out.println("Emp No 1");
            case 2 -> System.out.println("Emp No 2");
            case 3 -> {
                System.out.println("Emp No 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT Dept");
                    case "Mgt" -> System.out.println("Management dept");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Default Employee");
        }
    }
}
