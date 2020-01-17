package com.tide.demo20;

import java.util.ArrayList;
import java.util.Collections;

public class Demo05FightingLandlords {
    public static void main(String[] args) {
        ArrayList<String> poker=new ArrayList<>();
        String[] colors={"♠","♥","♦","♣"};
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        poker.add("大王");
        poker.add("小王");

        for (String number:numbers){
            for (String color:colors){
//                System.out.println(color+number);
                poker.add(color+number);
            }
        }

        //使用集合工具类Collections中的方法：
        //static void shuffle(List<?> list)
        Collections.shuffle(poker);
//        System.out.println(poker);

        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> diPai=new ArrayList<>();

        for (int i=0; i<poker.size(); i++) {
            if (i>=51){
                String s=poker.get(i);
                diPai.add(s);
            } else if(i%3==0) {
                String s=poker.get(i);
                player01.add(s);
            } else if(i%3==1) {
                String s=poker.get(i);
                player02.add(s);
            } else if(i%3==2) {
                String s=poker.get(i);
                player03.add(s);
            }
        }


        System.out.println("底牌："+diPai);
        System.out.println("玩家一："+player01);
        System.out.println("玩家二："+player02);
        System.out.println("玩家三："+player03);
    }
}
