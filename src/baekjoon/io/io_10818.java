package baekjoon.io;

import java.util.Scanner;
import java.util.stream.Stream;

public class io_10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();
        String num2 = sc.nextLine();

        int val[] = Stream.of(num2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = val[0];
        int max = val[0];

        for(int i=0; i<num1; i++) {
            if(max < val[i]){
                max = val[i];
            } else if(min > val[i]) {
                min = val[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
