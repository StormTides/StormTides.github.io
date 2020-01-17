package com.tide.demo08;

public interface InterfaceAbstract {
    public abstract void mend1();
    public void mend2();
    abstract void mend3();
    void mend4();
    public default void mend5(){
        System.out.println("这是一个默认方法");
    }
}
