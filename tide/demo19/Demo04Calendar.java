package com.tide.demo19;

import java.util.Calendar;

public class Demo04Calendar {
    public static void main(String[] args) {

//        method1();
        method2();
    }

    private static void method2() {
        Calendar c= Calendar.getInstance();
        c.set(Calendar.YEAR,8888);
        c.set(Calendar.MONTH,7);
        c.set(Calendar.DATE,19);

        c.set(2088,6,29);

        int num1=c.get(Calendar.YEAR);
        System.out.println("年："+num1);

        int num2=c.get(Calendar.MONTH);
        System.out.println("月："+num2);

        int num3=c.get(Calendar.DATE);
        System.out.println("日："+num3);



    }

//    private static void method1() {
//        Calendar c= Calendar.getInstance();
//        int num1=c.get(Calendar.YEAR);
//        System.out.println("年："+num1);
//
//        int num2=c.get(Calendar.MONTH);
//        System.out.println("月："+num2);
//
//        int num3=c.get(Calendar.DATE);
//        System.out.println("日："+num3);
//
//        int num4=c.get(Calendar.DAY_OF_MONTH);
//        System.out.println(""+num4);
//
//        int num5=c.get(Calendar.HOUR);
//        System.out.println("时："+num5);
//
//        int num6=c.get(Calendar.MINUTE);
//        System.out.println("分："+num6);
//
//        int num7=c.get(Calendar.SECOND);
//        System.out.println("秒："+num7);
//
//    }
}
