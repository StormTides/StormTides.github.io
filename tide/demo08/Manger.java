package com.tide.demo08;

import java.util.ArrayList;

public class Manger extends User {

    public Manger() {
    }

    public Manger(String name, int money) {
        super(name, money);
    }

    //totalMoney需要发放的钱，count需要的个数
    public ArrayList<Integer> send(int totalMoney,int count) {
        ArrayList<Integer> redList=new ArrayList<>();
        int leftMoney=super.getMoney();
        if (leftMoney < totalMoney){
            System.out.println("没有钱");
            return redList;
        }
        super.setMoney(leftMoney-totalMoney);

        int avg=totalMoney / count;
        int mog=totalMoney % count;

        for (int i=0;i<avg-1;i++){
            redList.add(avg);
        }
        redList.add(avg+mog);
        return redList;
    }
}
