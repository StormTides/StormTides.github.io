package com.tide.demo16;

public class MyOuter {
    public void methodOuter() {
        int num=10;
        class Inner {
//            int num=20;
            public void methodInner() {
                System.out.println(num);
            }
        }
        Inner inner=new Inner();
        inner.methodInner();
    }
}
