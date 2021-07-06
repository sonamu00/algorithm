package baekjoon.io;

import java.util.Scanner;

public class io_2441 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 1; i <= input; i++){
            for(int k = 1; k < i; k++){
                System.out.print(" ");
            }
            for(int j = input; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
