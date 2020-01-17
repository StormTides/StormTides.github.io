package com.tide.demo03;

public class Student {
    private String name;
    private int age;
    public Student(){
        System.out.println("无参构造方法调用了");
    }
    public Student(String name ,int age){
        System.out.println("全参构造方法调用了");
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
