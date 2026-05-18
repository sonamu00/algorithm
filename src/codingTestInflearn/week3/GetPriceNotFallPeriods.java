package codingTestInflearn.week3;

public class GetPriceNotFallPeriods {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        printArray(getPriceNotFallPeriods(prices));

        System.out.print("정답 = [4, 3, 1, 1, 0] / 현재 풀이 값 = ");
        printArray(getPriceNotFallPeriods(prices));

        System.out.print("정답 = [6, 2, 1, 3, 2, 1, 0] / 현재 풀이 값 = ");
        printArray(getPriceNotFallPeriods(new int[]{3, 9, 9, 3, 5, 7, 2}));

        System.out.print("정답 = [6, 1, 4, 3, 1, 1, 0] / 현재 풀이 값 = ");
        printArray(getPriceNotFallPeriods(new int[]{1, 5, 3, 6, 7, 6, 5}));
    }

    public static int[] getPriceNotFallPeriods(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) { // O(N)
            int priceNotFallPeriod = 0;
            for (int j = i + 1; j < prices.length; j++) { // O(N)
                if (prices[i] <= prices[j]) {
                    priceNotFallPeriod++;
                } else {
                    priceNotFallPeriod++;
                    break;
                }
            }
            result[i] = priceNotFallPeriod;
        }

        return result;
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