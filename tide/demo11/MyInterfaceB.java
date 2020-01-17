package com.tide.demo11;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void method();
    public default void methodDefaultAbs(){
        System.out.println("洗澡");
    }
}
