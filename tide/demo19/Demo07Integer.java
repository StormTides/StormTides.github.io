package com.tide.demo19;

public class Demo07Integer {
    public static void main(String[] args) {
        int i1=100;
        String s1=i1+"";
        System.out.println(s1+200);

        String s2=Integer.toString(i1);
        System.out.println(s2+200);

        String s3=String.valueOf(i1);
        System.out.println(s3+200);

        int s4=Integer.parseInt(s1);
        System.out.println(s4-10);
    }
}
