package com.baekjoon.io;

import java.util.Scanner;

public class io_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        int b = 0;
        int sum[] = new int[t];

        for(int i=0; i<t; i++){
            sc.nextLine();
            a = sc.nextInt();
            b = sc.nextInt();
            sum[i] = a+b;
        }
        for (int s: sum) {
            System.out.println(s);
        }
    }
}
