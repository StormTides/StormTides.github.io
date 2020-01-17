package com.tide.demo20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo06List {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);

        list.add(3,"js");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(4,"A");
        System.out.println(list);
        System.out.println("================");

        for (int i=0;i<list.size();i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("================");

        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("================");

        for (String i:list) {
            System.out.println(i);
        }

    }
}
