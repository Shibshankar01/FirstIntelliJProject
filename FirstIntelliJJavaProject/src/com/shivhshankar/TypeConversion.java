package com.shivhshankar;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //type casting
        //works automatically if the left side is bigger than the right  side of the expression
        //but will have to do it explicitly if the left side is smaller than the right side of the expression
        int num1 = (int)sc.nextFloat();

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)a; //257%256
        System.out.println(b);

        //all byte, shorts and char expression will be converted to integer values.
        //For example:- (byte)3*(byte)4 will be converted to integer first
        //also char comparisons will be cnverted to integers


    }
}
