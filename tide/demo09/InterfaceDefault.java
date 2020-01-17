package com.tide.demo09;

public interface InterfaceDefault {
    public abstract void MethodAbs();
    public default void MethodDefault(){
        System.out.println("这是默认方法");
    }
}
