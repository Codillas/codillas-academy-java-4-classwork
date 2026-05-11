package lesson_15_math;

public class Main {

    void main() {
        int max = Math.max(5, 10); // Повертає 10
        System.out.println("Максимум: " + max);

        int min = Math.min(3, 7); // Повертає 3
        System.out.println("Мінімум: " + min);

        int abs = Math.abs(-4); // Повертає 4
        System.out.println("Модуль числа: " + abs);

        double ceil = Math.ceil(4.5);   // Округлення в більший бік.
        System.out.println("Округлення в більший бік " + ceil);

        double floor = Math.floor(4.5); // Округлення в менший бік.
        System.out.println("Округлення в менший бік " + floor);

        long round = Math.round(4.5); // Округлення до найближчого цілого.
        System.out.println("Традиційне округлення " + round);

        double sqrt = Math.sqrt(16); // Повертає 4.0
        System.out.println("Корінь " + sqrt);

        double pow = Math.pow(2, 3); // Повертає 8.0
        System.out.println("Степінь " + pow);
    }
}
