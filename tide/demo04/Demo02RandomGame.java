package com.tide.demo04;

import java.util.Random;
import java.util.Scanner;

public class Demo02RandomGame {
    public static void main(String[] args) {
        Random re=new Random();
        int i=re.nextInt(100)+1;//1~100
        Scanner sc=new Scanner(System.in);
        while (true){
            int j=sc.nextInt();
            if (j > i){
                System.out.println("太大了");
            }else if(j<i){
                System.out.println("太小了");
            }else {
                System.out.println("猜中了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
