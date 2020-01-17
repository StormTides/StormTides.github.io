package com.tide.demo15;

public class Body {

    public class Heart {
        public void beat() {
            System.out.println("心脏跳动，蹦蹦蹦！！！");
            System.out.println("我叫"+name);
        }
    }

    private String name;

    public void methodBody() {
        System.out.println("外部类的方法");
        Heart heart=new Heart();
        heart.beat();
        System.out.println("========匿名对象=======");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
