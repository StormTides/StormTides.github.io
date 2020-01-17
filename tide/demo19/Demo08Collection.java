package com.tide.demo19;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo08Collection {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>() ;
        System.out.println(coll);         //重写了toString()方法

        System.out.println("==========使用public boolean add(E e)方法添加元素==========");
        boolean b1=coll.add("李四");
        System.out.println("b1:"+b1);
        System.out.println(coll);
        coll.add("张三");
        coll.add("");
        coll.add("田七");
        System.out.println(coll);

        System.out.println("==========使用public void clear()方法删除元素，public boolean isEmpty()方法是否为空==========");
        coll.clear();
        System.out.println("使用clear()方法后:"+coll);
        boolean b5=coll.isEmpty();
        System.out.println("当前集合是否为空："+b5);

        System.out.println("==========使用public boolean remove(E e)方法删除给定元素==========");
        coll.add("张三");
        coll.add("李四");
        coll.add("田七");
        boolean b2=coll.remove("田七");
        System.out.println("b2:"+b2);
        System.out.println("删除元素后:"+coll);

        System.out.println("==========使用public boolean contains(E e)方法判断当前集合是否包含给定对象==========");
        coll.add("迪丽热巴");
        coll.add("马尔扎哈");
        System.out.println("添加元素后："+coll);
        boolean b3=coll.contains("古力娜扎");
        System.out.println("古力娜扎是否在："+b3);
        boolean b4=coll.contains("马尔扎哈");
        System.out.println("马尔扎哈是否在："+b4);

        System.out.println("==========使用public int size(E e)方法判断当前集合元素中个数==========");
        int b6=coll.size();
        System.out.println("当前集合元素中个数："+b6);

        System.out.println("==========使用public Object[] toArray()方法把集合中元素存储在数组中==========");
        Object[] objects = coll.toArray();
        System.out.println("集合为："+Arrays.toString(objects));
        coll.clear();
        boolean b8 = coll.isEmpty();
        System.out.println("使用clear()方法后集合是否为空："+ b8);
        System.out.println("集合："+coll);
        System.out.println("集合为："+Arrays.toString(objects));
    }
}
