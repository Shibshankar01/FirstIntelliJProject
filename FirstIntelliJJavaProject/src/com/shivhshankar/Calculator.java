package com.shivhshankar;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while(true){
            System.out.println("Enter the operator");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("Enter the two numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(op == '+'){
                    result = num1 + num2;
                }
                if(op == '-'){
                    result = num1 - num2;
                }
                if(op == '*'){
                    result = num1 * num2;
                }
                if(op == '/'){
                    if(num2!= 0){
                        result = num1 / num2;
                    }
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operations!");
            }
            System.out.println(result);
        }

    }
}
