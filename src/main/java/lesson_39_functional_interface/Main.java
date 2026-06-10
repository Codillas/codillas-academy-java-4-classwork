package lesson_39_functional_interface;

import lesson_16_classes.animals.Cat;
import lesson_16_classes.animals.Racoon;

import java.math.BigDecimal;
import java.util.function.*;

public class Main {
    static void main() {

//    1.Predicate
//        Перевірка, чи є число негативним
        Predicate<Integer> isNumberNegative = n -> n < 0;
        System.out.println(isNumberNegative.test(0));
        System.out.println(isNumberNegative.test(-2));


//    2.Consumer
//        Реалізувати консьюмер, який виводить в консоль об'єкт Кота в красивому вигляді в консоль.
        Consumer<String> prettyCat = name -> System.out.println("Pretty cat: " + name);
        prettyCat.accept("(=^･ω･^=)");


//    3.Supplier
//        який повертає рандомне число
        Supplier<Integer> dice = () -> {
            int value = (int) (Math.random() * 6) + 1;
            return value;
        };
        System.out.println("🎲" + dice.get());


//          який кидає NullPointerException
//        Supplier<String> error = () -> {
//            throw new NullPointerException();
//        };
//        System.out.println(error.get());

//    4.Function
//        який переводить інт у стрінг
        Function<Integer, String> exchange = x -> String.valueOf(x);
        System.out.println("Our string: " + exchange.apply(23));

//        кота в єнота (перетворюю клас в стрінгу)
        Function<Cat, String> catToRacoon = x -> "From now on you are Racoon!🦝";
        System.out.println("Magic transformation: " + catToRacoon.apply(new Cat()));

//        кота в єнота (перетворюю клас в клас)
        Function<Cat, Racoon> catToRacoon2 = x -> new Racoon();
        System.out.println("Magic transformation: " + catToRacoon.apply(new Cat()));


//    5.Unary Operator
//        який бере корінь з числа
        UnaryOperator<Integer> rootOfNumber = r -> (int) Math.sqrt(r);
        System.out.println("Root of number: " + rootOfNumber.apply(9));

//        який обчислює факторіал числа
        UnaryOperator<Long> factorialOfNumber = x -> {
            if (x == 0) {
                return 1L;
            }
            Long result = 1L;
            for (long i = 1; i <= x; i++) {
            result = result * i;
            }
            return result;
        };
        System.out.println("Factorial of number: " + factorialOfNumber.apply(15L));


//        який обчислює факторіал числа за допомогою Big Decimal
        Function<BigDecimal, BigDecimal> factorialOfNumber2 = x -> {
            if (x.compareTo(BigDecimal.ZERO) == 0) {
                return BigDecimal.ONE;
            }
            BigDecimal result = BigDecimal.ONE;
            for (BigDecimal i = BigDecimal.ONE; i.compareTo(x) <= 0; i = i.add(BigDecimal.ONE)) {
                result = result.multiply(i);
            }
            return result;
        };

        System.out.println("Factorial of number: " + factorialOfNumber2.apply(new BigDecimal("1115")));


//    6.Binary Operator
//        який із чисел a і b робить число ab (20, 50 -> 2050)
        BinaryOperator<Integer> glueNumbers = (a, b) -> {

            String aAsString = a.toString();
            String bAsString = b.toString();

            String resultAsString = aAsString.concat(bAsString);

            return Integer.parseInt(resultAsString);
        };

        BinaryOperator<Integer> glueNumbers2 = (x, y) ->
                Integer.parseInt(x.toString() + y.toString());

        BinaryOperator<Integer> combine = (a, b) -> Integer.parseInt(a + "" + b);

        System.out.println("result: " + glueNumbers.apply(20, 50));
        System.out.println("other result: " + glueNumbers2.apply(12, 34));
        System.out.println("combine result: " + combine.apply(59, 23));
    }
}
