package com.tide.demo04;

import java.util.ArrayList;

public class Demo03ArrayList {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        System.out.println(array);
        array.add("会计咯");
        array.add("计划表");
        array.add("卡吗");
        System.out.println(array);
        array.add("比较好比例");
        System.out.println(array);
        array.remove("卡吗");
        System.out.println(array);
        int size=array.size();
        System.out.println(size);
    }
}
