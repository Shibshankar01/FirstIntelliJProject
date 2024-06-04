package com.arraylist;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(100);
        list.add(34);
        list.add(35);
        list.add(9);
        list.set(0, 99);
        System.out.println(list);

    }
}
