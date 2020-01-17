package com.tide.demo04;

import java.util.ArrayList;

public class Demo06ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        array.add(100);
        array.add(120);
        array.add(50);
        array.add(55);
        array.add(65);
        array.add(30);
        array.add(10);
        System.out.print("{"+" ");
        for (int i=0; i<array.size();i++){
            int arr=array.get(i);
            System.out.print(arr+" ");
            if (i==array.size()-1){
                System.out.print("}");
            }else {
                System.out.print(","+" ");
            }
        }

    }
}
