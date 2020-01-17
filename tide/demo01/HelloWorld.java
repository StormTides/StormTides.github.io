package com.tide.demo01;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int[] arr={12,17,13,12,11,15};
        int temp;

        for (int i=1;i<arr.length;i++){

            if (arr[i]<arr[i-1]){
                temp = arr[i];
                for (int j=i;j>=0;j--){
                    if (j>0 && arr[j-1]>temp) {
                        arr[j]=arr[j-1];
                    }else {
                        arr[j]=temp;
                        break;
                    }
                }
            }
            System.out.print("第" + i + "排序：");
            System.out.println(Arrays.toString(arr));

        }


        System.out.print("最终排序：");
        System.out.print(Arrays.toString(arr));

    }
}
