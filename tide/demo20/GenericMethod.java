package com.tide.demo20;

public class GenericMethod {
    public <E> void method(E e){
        System.out.println(e);
    }
    public static <M> void method02(M m){
        System.out.println(m);
    }
}
