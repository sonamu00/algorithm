package codingTestInflearn;

public class find_not_repeating_first_character_01_05 {

    public static String result(String str) {
        String result = "_";
        char[] arrAlphabet = new char[26];
        char[] chars = str.toCharArray();
        char firstChar = 0;

        for (int i = 0; i < chars.length; i++) {
            int arrIdx = chars[i] - 'a';
            if (arrAlphabet[arrIdx] == 0 && firstChar != chars[i]) {
                firstChar = chars[i];
                arrAlphabet[arrIdx] = chars[i];
            } else {
                result = String.valueOf((char)arrAlphabet[arrIdx]);
                return result;
            }
        }

        return "_";
    }

    public static void main(String[] args) {
        System.out.println("정답 = d 현재 풀이 값 =" + result("abadabac"));
        System.out.println("정답 = c 현재 풀이 값 =" + result("aabbcddd"));
        System.out.println("정답 =_ 현재 풀이 값 =" + result("aaaaaaaa"));
    }
}
