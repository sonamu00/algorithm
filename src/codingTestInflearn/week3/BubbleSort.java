package codingTestInflearn.week3;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] input) {
        // 1. 인덱스 두개를 왼쪽에서부터 비교하며 커서를 이동한다.
        // 2. 이전 인덱스가 이후 인덱스보다 크면 임시변수에 값을 담은 후, 두 값을 바꾼다.
        // 3. 배열을 모두 탐색했으면 가장 큰 값이 오른쪽에 정렬되어 있는 상태이므로, 한번의 정렬마다 탐색할 배열 길이를 줄인다.
        int changeNum;
        int cursor = input.length - 1;

        // 시간복잡도 => O(N^2)
        while (cursor >= 0) { // O(N)
            for (int i = 0; i < cursor; i++) { // O(N)
                if (input[i] > input[i+1]) {
                    changeNum = input[i];
                    input[i] = input[i+1];
                    input[i+1] = changeNum;
                }
            }

            cursor--;
        }

        return input;
    }

    public static void main(String[] args) {
        System.out.println("정답 = [1, 2, 4, 6, 9] / 현재 풀이 값 = " + Arrays.toString(
                bubbleSort(new int[]{4, 6, 2, 9, 1})));
        System.out.println("정답 = [-1, 3, 9, 17] / 현재 풀이 값 = " + Arrays.toString(
                bubbleSort(new int[]{3, -1, 17, 9})));
        System.out.println("정답 = [-3, 32, 44, 56, 100] / 현재 풀이 값 = " + Arrays.toString(
                bubbleSort(new int[]{100, 56, -3, 32, 44})));
    }
}
