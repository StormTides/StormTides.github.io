package com.tide.demo05;

import java.util.Scanner;

public class Demo01StringCount {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        String input=Scanner.next();

        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;

        char[] chars = input.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i] >= 'a' && chars[i] <= 'z'){
                countLower+=1;
            }else if (chars[i] >= 'A' && chars[i] <= 'Z'){
                countUpper+=1;
            }else if (chars[i]>= '0' && chars[i]<='9'){
                countNumber+=1;
            }else {
                countOther+=1;
            }
        }
        System.out.println("大写字母个数是"+countUpper);
        System.out.println("小写字母个数是"+countLower);
        System.out.println("数字个数是"+countNumber);

        System.out.println("其他个数是"+countOther);

    }
}
