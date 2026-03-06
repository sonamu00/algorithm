package codingTestInflearn.week2;

public class IsPalindromeRecursive {
    public static boolean isPalindrome(String inputStr) {
        // 앞쪽에 글자와 뒤쪽에 글자가 다를 때 재귀 탈출
        if (inputStr.charAt(0) != inputStr.charAt(inputStr.length() - 1)) {
            return false;
        }
        // 문자가 1개만 존재하면 재귀 탈출 (앞쪽 글자와 뒷쪽 글자 모두 회문일 때 종료 조건)
        if (inputStr.length() <= 1) {
            return true;
        }

        return isPalindrome(inputStr.substring(1, inputStr.length() - 1));
    }

    public static void main(String[] args) {
        String input = "abcba";

        System.out.println(isPalindrome(input));
    }
}
