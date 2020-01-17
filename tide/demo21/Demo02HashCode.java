package com.tide.demo21;

import java.util.HashSet;

public class Demo02HashCode {
    public static void main(String[] args) {
        Person p1=new Person();
        int s1=p1.hashCode();
        System.out.println(s1);

        Person p2=new Person();
        int s2=p2.hashCode();
        System.out.println(s2);

        String p3="重地";
        int s3=p3.hashCode();
        System.out.println(s3);

        String p4="通话";
        int s4=p4.hashCode();
        System.out.println(s4);

        String p5="abc";
        String p6="abc";

        HashSet<String> hs=new HashSet<>();
        hs.add(p5);
        hs.add(p6);
        hs.add(p3);
        hs.add(p4);
        hs.add("abc");
        System.out.println(hs);
    }
}
