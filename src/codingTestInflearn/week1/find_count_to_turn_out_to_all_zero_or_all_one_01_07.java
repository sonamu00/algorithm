package codingTestInflearn.week1;

public class find_count_to_turn_out_to_all_zero_or_all_one_01_07 {
    public static int find_count_to_turn_out_to_all_zero_or_all_one(String input) {
        /**
         * 조건 1: 0과 1 둘 중에 하나만 선택해서 해당 숫자로만 뒤집어야함
         * 조건 2: 0과 1 중에 선택해서 뒤집었을 때 가장 최소한으로 뒤집을 수 있는 숫자를 선택해야함
         * 조건 3: 연속된 숫자를 뒤집는 건 횟수 1개로 본다
         * 숫자가 한가지: 안 바꾸기
         * 연속된 숫자가 더 많은 케이스: 적은 것을 바꾸는 것이 나음
         * 연속된 숫자가 끝나는 시점에 카운트 1을 더해야함 => 이전 글자가 현재 글자와 다를 때 카운트 1
         * => 숫자가 하나만 있는 케이스여도 반복되는 글자와 같은 횟수로 되는 문제가 있음
         * => 숫자가 바뀌는 지점에서 카운트를 세기 때문에, 첫번째 숫자의 카운트를 먼저 세야함
         */
        int result = 0;
        int zeroCnt = 0;
        int oneCnt = 0;

        char[] inputList = input.toCharArray();
        char prevNum = inputList[0];

        if ('0' == prevNum) {
            zeroCnt++;
        } else {
            oneCnt++;
        }

        for (int i = 1; i < inputList.length; i++) {
            if ('0' == inputList[i] && '0' != prevNum) {
                zeroCnt++;
            } else if ('1' == inputList[i] && '1' != prevNum) {
                oneCnt++;
            }
            prevNum = inputList[i];
        }

        result = zeroCnt > oneCnt ? oneCnt : zeroCnt;

        return result;
    }

    public static void main(String args[]) {
        System.out.println("result 0001100: " + find_count_to_turn_out_to_all_zero_or_all_one("0001100"));
        System.out.println("result 11111: " + find_count_to_turn_out_to_all_zero_or_all_one("11111"));
        System.out.println("result 00000001: " + find_count_to_turn_out_to_all_zero_or_all_one("00000001"));
        System.out.println("result 11001100110011000001: " + find_count_to_turn_out_to_all_zero_or_all_one("11001100110011000001"));
        System.out.println("result 11101101: " + find_count_to_turn_out_to_all_zero_or_all_one("11101101"));
    }
}
