package lesson_14_practice;

import java.util.Scanner;

public class ClassworkArrays {

    void main() {

        // Пошук елемента за значенням
        Scanner scanner = new Scanner(System.in);

        // З клавіатури зчитати розмір масиву.
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        System.out.println("Ви ввели число " + size);

        // Створити масив цілих чисел розміром.
        int[] arr = new int[size];

        // За допомогою циклу зчитати з клавіатури кожен елемент масиву.
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введіть елемент масиву на позиції " + i);
            arr[i] = scanner.nextInt();
        }

        // Виводимо введений масив в консоль
        System.out.println("Масив має вигляд: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Запитати у користувача, яке число треба знайти.
        System.out.println("Яке число будемо шукати?");

        int numberToSearch = scanner.nextInt();

        // Перевірити, чи це число є в масиві (за допомогою циклу).
        // Вивести, на яких індексах (одному чи декількох) міститься шукане число,
        // або повідомлення, що такого числа в масиві немає.

        // шукаємо - 7
        //  0  1  2  3  4  5 - i
        // {1, 2, 3, 1, 5, 7} - arr[i]

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                System.out.println("Елемент знаходиться на позиції " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Елемент не знайдено");
        }
    }
}
