package codingTestInflearn.week2;

public class FactorialRecursive {

    // 3! = 3 * 2 * 1

    // factorial(n) = n* factorial(n-1)
    // factorial(n - 1) = (n -1)* factorial(n-2)

    // factorial(1) = 1

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // 5*4*3*2*1 = 120
        System.out.println(factorial(5));
    }
}
