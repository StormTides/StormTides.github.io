package com.tide.demo12;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void method();
    public default void methodAbs(){
        System.out.println("bbb");
    }
}
