package com.tide.demo17;

public class Person {
    private String name;
    private int age;
    private Weapon weapon;

    public Person() {
    }

    public Person(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void method(){
        System.out.println("我是"+age+"岁的"+name+"拿着"+weapon.getCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
