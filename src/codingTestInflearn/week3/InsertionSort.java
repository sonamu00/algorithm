package codingTestInflearn.week3;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        int idx;
        int temp;

        for (int i = 1; i < array.length; i++) {

            idx = i;

            for (int j = i - 1; 0 <= j; j--) {
                if (array[idx] < array[j]) {
                    temp = array[j];
                    array[j] = array[idx];
                    array[idx] = temp;
                    idx = j;
                } else {
                    // 앞에 비교값들이 이미 정렬이 된 상태 -> 비교하지 않고 다음 루프 실행 -> N의 정렬 상태에 따라 O(N) ~ O(N^2) 의 시간복잡도가 된다
                    // ex) 5, 8, 4, 7 -> 4, 5, 8, 7 이렇게 4(선택값) 기준으로 앞이 정렬된 상태에서 7을 비교하면 8을 제외하고 이미 작은 값들로 있음
                    break;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] input = {4, 6, 2, 9, 1};

        System.out.println("정답 = [4, 5, 7, 7, 8] / 현재 풀이 값 = "
                + Arrays.toString(insertionSort(new int[]{5, 8, 4, 7, 7})));
        System.out.println("정답 = [-1, 3, 9, 17] / 현재 풀이 값 = "
                + Arrays.toString(insertionSort(new int[]{3, -1, 17, 9})));
        System.out.println("정답 = [-3, 32, 44, 56, 100] / 현재 풀이 값 = "
                + Arrays.toString(insertionSort(new int[]{100, 56, -3, 32, 44})));
    }

}
