package com.tide.demo16;

public class Demo03MyInterface {
    public static void main(String[] args) {
        MyInterface obj=new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类覆盖重写");
            }
        };
        obj.method();
    }
}
