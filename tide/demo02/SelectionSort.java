package com.tide.demo02;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={12,17,13,12,11,15};
        for (int i=0;i<arr.length;i++){
            int temp=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=j;
                    int x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
        System.out.print("最终排序：");
        System.out.print(Arrays.toString(arr));
    }
}
