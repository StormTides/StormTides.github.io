package com.tide.demo19;

import java.util.ArrayList;

public class Demo10Foreach {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method2() {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        arr.add("ddd");
        for (String i:arr){
            System.out.println(i);
        }
    }

    public static void method1(){
        int arr[]={1,2,3,4,5};
        for (int i:arr){
            System.out.println(i);
        }
    }
}
