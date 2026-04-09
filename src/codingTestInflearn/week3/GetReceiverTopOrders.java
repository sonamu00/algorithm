package codingTestInflearn.week3;

public class GetReceiverTopOrders {
    public static void main(String[] args) {
        int[] top_heights = {6, 9, 5, 7, 4};

        printArray(getReceiverTopOrders(top_heights));  // [0, 0, 2, 2, 4] 가 반환되어야 한다!

        System.out.print("정답 = [0, 0, 2, 2, 4] / 현재 풀이 값 = ");
        printArray(getReceiverTopOrders(new int[]{6, 9, 5, 7, 4}));

        System.out.print("정답 = [0, 0, 2, 3, 3, 3, 6] / 현재 풀이 값 = ");
        printArray(getReceiverTopOrders(new int[]{3, 9, 9, 3, 5, 7, 2}));

        System.out.print("정답 = [0, 0, 2, 0, 0, 5, 6] / 현재 풀이 값 = ");
        printArray(getReceiverTopOrders(new int[]{1, 5, 3, 6, 7, 6, 5}));
    }

    public static int[] getReceiverTopOrders(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i = heights.length - 1; i > 0; i--) { // O(N)
            for (int j = i - 1; j >= 0; j--) { // O(N)
                if (heights[i] <= heights[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
