package codingTestInflearn.week3;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        int minIdx;
        int temp;

        for (int i = 0; i < array.length; i++) {

            minIdx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
            }

            temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;

        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println("정답 = [1, 2, 4, 6, 9] / 현재 풀이 값 = "
                + Arrays.toString(selectionSort(new int[]{4, 6, 2, 9, 1})));
        System.out.println("정답 = [-1, 3, 9, 17] / 현재 풀이 값 = "
                + Arrays.toString(selectionSort(new int[]{3, -1, 17, 9})));
        System.out.println("정답 = [-3, 32, 44, 56, 100] / 현재 풀이 값 = "
                + Arrays.toString(selectionSort(new int[]{100, 56, -3, 32, 44})));
    }

}
