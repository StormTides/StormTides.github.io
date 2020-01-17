package com.tide.demo18;

public class Demo03Equals {
    public static void main(String[] args) {
        Person per1=new Person("张三",19);
        Person per2=new Person("李四",20);
        Person per3=new Person("张三",19);
        System.out.println(per1.equals(per3));
    }
}
