package com.tide.demo11;

public interface MyInterface {
    public default void method(){
        System.out.println("接口方法");
    }
}
