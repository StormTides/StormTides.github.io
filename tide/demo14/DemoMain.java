package com.tide.demo14;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();

        USB usbMouse=new Mouse();
        computer.useDevice(usbMouse);

        KeyBoard keyBoard=new KeyBoard();
        computer.useDevice(keyBoard);

        computer.powerOff();
    }
}
