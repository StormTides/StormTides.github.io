package com.tide.demo20;

public class Demo01GenericClass {
    public static void main(String[] args) {
        GenericClass gc=new GenericClass();
        gc.setName("jaSEHbuk");
        Object obj = gc.getName();
        System.out.println(obj);

        GenericClass<Integer> gc2=new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        GenericClass<String> gc3=new GenericClass<>();
        gc3.setName("黎明");
        String name2 = gc3.getName();
        System.out.println(name2);
    }
}
