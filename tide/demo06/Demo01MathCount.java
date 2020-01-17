package com.tide.demo06;

public class Demo01MathCount {
    public static void main(String[] args) {
        double i=-10.8;
        int count=0;
        for (double num=Math.ceil(i);num<5.9;num++){
            if (Math.abs(num)>6 || Math.abs(num)<2.1){
                System.out.print(num+" ");
                count++;
            }
        }
        System.out.println();
        System.out.print("在(-10.8,5.9)区间,绝对值大于6小于2.1的整数有"+count+"个");

    }
}
