package com.tide.demo09;

public interface InterfaceStaticB {
    public static void methodStaticA(){
        System.out.println("AAA");
        methodStaticComment();
    }
    public static void methodStaticB(){
        System.out.println("BBB");
        methodStaticComment();
    }
    private static void methodStaticComment(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }
}
