package com.tide.demo2;

import java.util.Arrays;

public class ShellsSort {
    public static void main(String[] args) {
        int[] arr={12,17,13,12,11,15};
        for (int i=arr.length-1;i>0;i--){
            for (int y=0;y+i<arr.length;y++){
                if(arr[y]>arr[y+i]){
                    int temp=arr[y];
                    arr[y]=arr[y+i];
                    arr[y+i]=temp;
                }
            }
        }
        System.out.print("最终排序：");
        System.out.print(Arrays.toString(arr));
    }
}
