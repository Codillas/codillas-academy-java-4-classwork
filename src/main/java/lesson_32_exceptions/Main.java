package lesson_32_exceptions;

public class Main {
    static void main() {
        int a = 10;
        int b = 0;

        int result;

        try {
            result = MyMath.divide(a, b);
        } catch (DivisionByZeroException e) {
            System.out.println("Виникла помилка при діленні на 0");

            result = 0;
        } finally {
            System.out.println("Частина коду під назвою Finally буде завжди виконуватись!");
        }
        System.out.println(result);
    }
}
