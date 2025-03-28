package codingTestInflearn.week1;

public class summarize_string_01_07_plus {

    public static String summarize_string(String input) {
        /**
         * 출력할 것: 입력 알파벳과 빈도 개수, 각 알파벳을 / 단위로 나눠서 출력
         * 1. 알파벳 개수 카운트: 각 알파벳별 카운트를 저장하는 곳이 필요함
         * 2. 문자열에서 알파벳 하나씩 추출
         * 3. 각 알파벳별 카운트를 하나로 합치기
         */
        StringBuilder result = new StringBuilder("");
        int[] arrAlphabet = new int[26];
        char[] toCharAlphabet = input.toCharArray();

        for (int i = 0; i < toCharAlphabet.length; i++) {
            int arrIdx = toCharAlphabet[i] - 'a';
            arrAlphabet[arrIdx] += 1;
        }

        for (int i = 0; i < arrAlphabet.length; i++) {
            if (arrAlphabet[i] == 0) continue;

            char alphabet = (char) ('a' + i);
            result.append(alphabet);
            result.append(arrAlphabet[i]);
            result.append("/");
        }

        result.delete(result.length() - 1, result.length());

        return result.toString();
    }
    public static void main(String args[]) {
        System.out.println("abc: " + summarize_string("abc"));
        System.out.println("aaabbbc: " + summarize_string("aaabbbc"));
        System.out.println("abbbc: " + summarize_string("abbbc"));
        System.out.println("ahhhhz: " + summarize_string("ahhhhz"));
        System.out.println("acccdeee: " + summarize_string("acccdeee"));

    }
}
