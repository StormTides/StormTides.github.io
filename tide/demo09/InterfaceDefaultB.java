package com.tide.demo09;

public class InterfaceDefaultB implements InterfaceDefault{
    @Override
    public void MethodAbs(){
        System.out.println("BBB0");
    }
    @Override
    public void MethodDefault(){
        System.out.println("改写方法");
    }
}
