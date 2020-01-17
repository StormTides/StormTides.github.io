package com.tide.demo19;

public class Demo06StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu=new StringBuilder();

//        StringBuilder bu2=bu.append("abc");
//        System.out.println(bu);
//        System.out.println(bu2);
//        System.out.println(bu==bu2);

//        bu.append("abc");
//        bu.append(12);
//        bu.append(true);
//        bu.append(8.8);
//        bu.append('中');
//        System.out.println(bu);

        bu.append("abc").append(12).append(true).append(8.8).append('中');
        System.out.println(bu);

    }
}
