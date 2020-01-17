package com.tide.demo01;

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who) {
        System.out.println("给"+who);
    }

    public void sendMessage() {
        System.out.println("发短信");
    }
}
