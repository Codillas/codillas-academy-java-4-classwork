package lesson_19_recursion;

public class Math {

    /*  Iterative method

        public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
*/

// Recursive method

    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {

            return n * getFactorial(n - 1);
        }
    }
}
