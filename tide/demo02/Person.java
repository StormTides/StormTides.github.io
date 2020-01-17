package com.tide.demo02;

public class Person {
    String name;
    private int age;

    public void show() {
        System.out.println("name:" + name + " " + "age:" + age);
    }

    public void setAge(int a) {
        age = a;
    }

    public int GetAge() {
        return age;
    }
}
