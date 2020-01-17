package com.tide.demo20;

public class Demo02GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm=new GenericMethod();
        gm.method("abc");
        gm.method(1);
        gm.method('家');
        gm.method(8.8);
        gm.method(true);

        GenericMethod.method02("静态方法：类名.方法名 使用");
    }
}
