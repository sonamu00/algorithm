package baekjoon.io;

import java.util.Scanner;

public class io_2442 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 1; i <= input; i++) {
            for (int a = input - 1; a >= i; a--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * i - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
