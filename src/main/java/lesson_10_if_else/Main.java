package lesson_10_if_else;

import java.util.Arrays;

public class Main {
    public static void main() {

        /*
            Написати програму що
            - робить елемент масиву під індексом 0 вдвічі більшим (done)
            - робить останній елемент масиву додатнім (done)
        */

        int[] numbers = {-5, 1, 2, -4, -5, -4};

        // First element => index = 0
        // Last element => array.length - 1

        int lastNumberIdx = numbers.length - 1;

        int firstNumber = numbers[0];
        int lastNumber = numbers[lastNumberIdx];

        numbers[0] = firstNumber * 2;

        if (lastNumber < 0) {
            numbers[lastNumberIdx] = lastNumber * -1;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
