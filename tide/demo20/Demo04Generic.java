package com.tide.demo20;

import java.util.ArrayList;

public class Demo04Generic {
    public static void main(String[] args) {
        ArrayList<Integer> arr01=new ArrayList<>();
        arr01.add(1);
        arr01.add(2);

        ArrayList<String> arr02=new ArrayList<>();
        arr02.add("abc");
        arr02.add("xyz");

        printArray(arr01);
        printArray(arr02);

    }
    public static void printArray(ArrayList<?> list){
        System.out.println(list);
    }
}
