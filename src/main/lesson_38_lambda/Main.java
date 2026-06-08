package main.lesson_38_lambda;

import org.w3c.dom.ls.LSOutput;

public class Main {
    static void main() {

        Operation operation = new Operation();

        int result = operation.calculate(2, 8);

        System.out.println(result);

        Operationable operation2 = new Operation() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        int result2 = operation2.calculate(2, 8);
        System.out.println(result2);

        Operationable operation3 = (a, b) -> {
            if (b == 0) {
                System.out.println("Я тобі покажу результат, але на нуль ділити не можна!👿");
                return 0;
            } else {
                return a / b;
            }
        };

        int result3 = operation3.calculate(7, 0);
        System.out.println(result3);

        // Ви можете змінювати назви змінних як завгодно.
        Operationable operation4 = (x, y) -> x * y;

        Calculator calculator = new Calculator();

        int result4 = calculator.operation2(9, 5, (c, d) -> c - d);

        System.out.println(result4);
    }
}