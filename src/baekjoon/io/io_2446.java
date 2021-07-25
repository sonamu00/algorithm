package baekjoon.io;

import java.util.Scanner;

public class io_2446 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 0; i < input; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = input-1; k >= i; k--) {
                System.out.print("*");
            }
            for(int k = input-1; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < input; i++) {
            for(int j = input-1; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
