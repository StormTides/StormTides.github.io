package com.tide.demo04;

import java.util.ArrayList;
import java.util.Random;

public class Demo07ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        Random arr=new Random();
        for (int i=0;i<20;i++){
            int j=arr.nextInt(100)+1;
            System.out.println("准备的"+ (i+1) +"号添加的数："+j);
            if (j%2==0){
                array.add(j);
                System.out.println("已添加的数："+j);
            }else {
                System.out.println("注意：添加不成功！！！！！");
            }
        }
        System.out.println("最终的数："+array);
    }
}
