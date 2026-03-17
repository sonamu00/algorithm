package codingTestInflearn.week2;

public class IsPalindromeFor {
    public static boolean isPalindrome(String string) {
        int n = string.length();
        for (int i = 0; i < n; i++) { // i: 0 ~ n - 1
            if (string.charAt(i) != string.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "abcba";

        System.out.println(isPalindrome(input));
    }
}