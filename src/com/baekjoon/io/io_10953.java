package com.baekjoon.io;

import java.util.Scanner;

public class io_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String str[] = sc.next().split(",");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            System.out.println(a+b);
        }
    }
}
