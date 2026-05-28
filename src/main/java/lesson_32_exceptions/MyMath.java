package lesson_32_exceptions;

public class MyMath {

    public static int divide(int a, int b) throws DivisionByZeroException {

        if (b == 0) {
            throw new DivisionByZeroException("This is our exception");
        }

        return a / b;
    }

}
