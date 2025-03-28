package codingTestInflearn.week1;

import java.util.*;

public class find_prime_list_under_number_01_07 {
    public static List<Integer> find_prime_list_under_number(int input) {
        List<Integer> resultList = new ArrayList<>();
        int num = 0;

        for (int i = 2; i < input; i++) {
            if (i % 2 != 0 || i == 2) {
                resultList.add(i);
            }
        }

        return resultList;
    }
    public static void main(String args[]) {
        int input = 20;
        System.out.println("result = " + find_prime_list_under_number(input));
    }
}

