package baekjoon.io;

import java.util.Scanner;

public class io_2445 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= input; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int k = input-1; k >= i; k--) {
                System.out.print(" ");
            }
            for(int k = input-1; k >= i; k--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < input; i++) {
            for(int j = input-1; j >= i; j--) {
                System.out.print("*");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for(int j = input-1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
