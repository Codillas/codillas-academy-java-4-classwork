package lesson_22_test;

import java.time.LocalDate;

public class Main {

    static void main() {

        Woman woman = new Woman("Anna", LocalDate.of(2026, 5, 7), 100);
        System.out.println(woman.isHappy());
        System.out.println(woman.getPointsBalance());
    }
}
