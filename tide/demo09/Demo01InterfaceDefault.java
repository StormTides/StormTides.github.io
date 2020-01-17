package com.tide.demo09;

public class Demo01InterfaceDefault {
    public static void main(String[] args) {
        InterfaceDefaultA a=new InterfaceDefaultA();
        a.MethodAbs();
        a.MethodDefault();
        System.out.println("==============");
        InterfaceDefaultB b=new InterfaceDefaultB();
        b.MethodAbs();
        b.MethodDefault();
    }
}
