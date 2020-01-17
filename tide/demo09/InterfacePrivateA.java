package com.tide.demo09;

public interface InterfacePrivateA {
    public default void methodA(){
        System.out.println("AAA");
        methodComment();
    }
    public default void methodB(){
        System.out.println("BBB");
        methodComment();
    }
    private void methodComment(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }
}
