package com.tide.demo11;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }
    @Override
    public void method(){
        System.out.println("覆盖重写了A B方法");
    }
    @Override
    public void methodDefaultAbs(){
        System.out.println("sdf");
    }
}
