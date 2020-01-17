package com.tide.demo20;

public class Demo03GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl1 gi=new GenericInterfaceImpl1();
        gi.method("abc");

        GenericInterfaceImpl2<String> gi2=new GenericInterfaceImpl2<>();
        gi.method("njkseh");
        GenericInterfaceImpl2<Double> gi3=new GenericInterfaceImpl2<>();
        gi.method(8.888888);
        GenericInterfaceImpl2<Boolean> gi4=new GenericInterfaceImpl2<>();
        gi.method(false);
    }
}
