package com.tide.demo20;

public class GenericInterfaceImpl2<E> implements GenericInterface {
    @Override
    public void method(Object o) {
        System.out.println(o);
    }
}
