package com.tide.demo11;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void method();
    public default void methodDefaultAbs(){
        System.out.println("吃饭");
    }
}
