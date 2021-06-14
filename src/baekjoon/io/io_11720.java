package baekjoon.io;

import java.util.Scanner;

public class io_11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String num2 = sc.next().substring(0, num1);
        int sum = 0;

        while(num1-- > 0){
            sum = sum + Integer.parseInt(String.valueOf(num2.charAt(num1)));
        }
        System.out.println(sum);
    }
}
