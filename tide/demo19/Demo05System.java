package com.tide.demo19;


import java.util.Arrays;

public class Demo05System {
    public static void main(String[] args) {
//        method1();
        method2();
    }

    private static void method2() {
        int[] src={1,2,3,4,5};
        int[] dest={6,7,8,9,10};
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }

//    private static void method1() {
//        Long i=System.currentTimeMillis();
//        for (int x=0; x<100; x++) {
//            System.out.println(x);
//        }
//        Long j=System.currentTimeMillis();
//        System.out.println("运行的时间为："+(j-i)+" 毫秒。");
//    }
}
