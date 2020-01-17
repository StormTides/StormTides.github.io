package com.tide.demo04;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random random=new Random();
        for (int i=0;i<6;i++){
            int rand=random.nextInt(33)+1;
            list.add(rand);
            System.out.println("加入的数是："+rand);
            System.out.println("集合加入的数是："+list.get(i));
        }
        System.out.println(list);
    }
}
