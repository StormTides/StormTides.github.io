package com.tide.demo17;

public class Demo01Person {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("盖伦");
        person.setAge(19);

        //方法一
        Weapon weapon=new Weapon("多兰剑");
        person.setWeapon(weapon);

        //方法二
//        person.setWeapon(new Weapon("多兰剑"));

        person.method();
    }
}
