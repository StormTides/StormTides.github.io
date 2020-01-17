package com.tide.demo14;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void methodCat(){
        System.out.println("子类特有方法");
    }
}
