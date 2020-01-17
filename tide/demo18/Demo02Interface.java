package com.tide.demo18;

import java.util.ArrayList;
import java.util.List;

public class Demo02Interface {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        List<String> result=addName(list);
        for (int i=0;i<result.size();i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String> addName(List<String> list){
        list.add("古力娜扎");
        list.add("迪丽热巴");
        list.add("巴尔扎哈");
        return list;
    }
}
