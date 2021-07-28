package baekjoon.io;

import java.util.Scanner;

public class io_10992 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= input; i++) {
            for(int k = input-1; k >= i; k--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i*2-1; j++) {
                if(i!=1 && i!=input) {
                    if(j==1 || j==i*2-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
