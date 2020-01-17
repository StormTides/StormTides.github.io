package com.tide.demo14;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("骨头");
    }
    public void methodDog(){
        System.out.println("子类特有方法");
    }
}
