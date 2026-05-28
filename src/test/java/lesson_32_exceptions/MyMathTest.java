package lesson_32_exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MyMathTest {

    @Test
    void shouldThrowExceptionWhenDividingByZero (){
        //given
        int a = 10;
        int b = 0;

        // when & then
        Assertions.assertThrows(DivisionByZeroException.class, () -> MyMath.divide(a, b));
    }
}