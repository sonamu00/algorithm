package codingTestInflearn.week3;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] leftArray = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] rightArray = mergeSort(Arrays.copyOfRange(array, mid, array.length));

        return merge(leftArray, rightArray);
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int arrPoint1 = 0;
        int arrPoint2 = 0;
        int arrPoint3 = 0;

        while (true) {
            if (arrPoint1 == array1.length || arrPoint2 == array2.length) {
                int point = Math.min(arrPoint1, arrPoint2);
                int[] mergeArray = arrPoint1 > arrPoint2 ? array2 : array1;
                int mergePoint = arrPoint1 + arrPoint2;

                for (int i = point; i < mergeArray.length; i++) {
                    array3[mergePoint++] = mergeArray[i];
                }

                break;

            }

            if (array1[arrPoint1] > array2[arrPoint2]) {
                array3[arrPoint3] = array2[arrPoint2];
                arrPoint2++;
            } else {
                array3[arrPoint3] = array1[arrPoint1];
                arrPoint1++;
            }

            arrPoint3++;

        }

        return array3;
    }


    /* 재귀 없이 풀이
    public static int[] mergeSort(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int arrPoint1 = 0;
        int arrPoint2 = 0;
        int arrPoint3 = 0;

        while (true) {
            if (arrPoint1 == array1.length || arrPoint2 == array2.length) {
                int point = Math.min(arrPoint1, arrPoint2);
                int[] mergeArray = arrPoint1 > arrPoint2 ? array2 : array1;
                int mergePoint = arrPoint1 + arrPoint2;

                for (int i = point; i < mergeArray.length; i++) {
                    array3[mergePoint++] = mergeArray[i];
                }

                break;

            }

            if (array1[arrPoint1] > array2[arrPoint2]) {
                array3[arrPoint3] = array2[arrPoint2];
                arrPoint2++;
            } else {
                array3[arrPoint3] = array1[arrPoint1];
                arrPoint1++;
            }

            arrPoint3++;

        }

        return array3;
    }
    */

    public static void main(String[] args) {
        System.out.println("정답 = [-7, -1, 5, 6, 9, 10, 11, 40] / 현재 풀이 값 = "
                + Arrays.toString(mergeSort(new int[]{-7, -1, 9, 40, 5, 6, 10, 11})));
        System.out.println("정답 = [-1, 2, 3, 5, 10, 40, 78, 100] / 현재 풀이 값 = "
                + Arrays.toString(mergeSort(new int[]{-1, 2, 3, 5, 40, 10, 78, 100})));
        System.out.println("정답 = [-1, -1, 0, 1, 6, 9, 10] / 현재 풀이 값 = "
                + Arrays.toString(mergeSort(new int[]{-1, -1, 0, 1, 6, 9, 10})));
    }
}
