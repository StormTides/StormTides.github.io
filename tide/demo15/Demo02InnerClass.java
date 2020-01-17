package com.tide.demo15;

public class Demo02InnerClass {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        inner.MethodInner();
        System.out.println(inner.num);
    }
}
