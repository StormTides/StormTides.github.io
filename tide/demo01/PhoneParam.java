package com.tide.demo01;

public class PhoneParam {
    public static void main(String[] args) {
        Phone one =new Phone();
        one.brand="苹果";
        one.price=8088.0;
        one.color="土豪金";
        method(one);
    }

    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
