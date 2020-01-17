package com.tide.demo01;

public class PhoneReturn {
    public static void main(String[] args) {
        Phone two=getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one=new Phone();
        one.brand="苹果";
        one.price=8088.0;
        one.color="土豪金";
        return one;
    }
}
