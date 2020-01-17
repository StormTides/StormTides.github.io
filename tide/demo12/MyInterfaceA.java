package com.tide.demo12;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void method();
    public default void methodAbs(){
        System.out.println("aaa");
    }
}
