package com.tide.demo12;

public interface MyInterface extends MyInterfaceA,MyInterfaceB {

    @Override
    public default void methodAbs() {
        System.out.println("ab");
    }
}
