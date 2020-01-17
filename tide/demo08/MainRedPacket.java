package com.tide.demo08;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manger manger=new Manger("群主张三",100);
        Member one =new Member("成员one",0);
        Member two =new Member("成员two",0);
        Member three =new Member("成员three",0);

        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("========================");

        ArrayList<Integer> redList=manger.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manger.show();
        one.show();
        two.show();
        three.show();

    }
}
