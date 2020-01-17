package com.tide.demo14;

public class Demo01Main {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
//        animal.methodCat();
        Cat cat=(Cat) animal;
        cat.methodCat();
//        Dog dog=(Dog) animal;
//        dog.methodDog();
    }
}
