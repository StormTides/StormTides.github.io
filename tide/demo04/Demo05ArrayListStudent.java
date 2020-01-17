package com.tide.demo04;

import java.util.ArrayList;

public class Demo05ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<>();

        Student one=new Student("好几遍",18);
        Student two=new Student("卡了吗",24);
        Student three=new Student("不回家",38);
        Student four=new Student("角恐龙",118);

        array.add(one);
        array.add(two);
        array.add(three);
        array.add(four);

        for (int i=0 ; i<array.size() ; i++){
            Student stu=array.get(i);
            System.out.println("姓名："+stu.getName()+" ,年龄："+stu.getAge());
        }
    }




}
