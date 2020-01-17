package com.tide.demo03;

public class Demo1Student {
    public static void main(String[] args) {
        Student stu1 =new Student();
        Student stu2 =new Student("111",12);
        System.out.println("姓名："+stu2.getName()+" ,年龄"+stu2.getAge());
        stu2.setName("咋弄");
        System.out.println("姓名："+stu2.getName()+" ,年龄"+stu2.getAge());
    }

}
