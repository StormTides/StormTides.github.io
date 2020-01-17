package com.tide.demo19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02DateFormat {
    public static void main(String[] args) throws ParseException {
//        method1();
        method2();
    }

    private static void method2() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=sdf.parse("2019年12月23日 22时25分07秒");
        System.out.println(date);
    }

//    private static void method1() {
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
//        Date date=new Date();
//        String d = sdf.format(date);
//        System.out.println(date);
//        System.out.println(d);
//
//    }
}
