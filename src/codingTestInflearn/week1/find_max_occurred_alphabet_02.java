package codingTestInflearn.week1;

import java.util.*;

public class find_max_occurred_alphabet_02 {
    public static Character result(String strValue) {
        Character result = null;
        int max = 0;
        char[] chars = strValue.replaceAll("\\s", "").toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            int num = 0;

            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]).intValue() + 1);
            } else {
                map.put(chars[i], num);
            }

        }

        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("정답 = i 현재 풀이 값 =" + result("hello my name is dingcodingco"));
        System.out.println("정답 = e 현재 풀이 값 =" + result("we love algorithm"));
        System.out.println("정답 = b 현재 풀이 값 =" + result("best of best youtube"));
    }
}
