package lesson_14_practice;

import java.util.Scanner;

public class ClassworkMatrix {

    void main() {
        // Двовимірний масив
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо розміри масиву
        System.out.print("Введіть n (рядки): ");
        int n = scanner.nextInt();

        System.out.print("Введіть m (стовпці): ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        // Заповнюємо масив
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("array[%d][%d] = ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        // Вивести на екран усі елементи матриці в табличному вигляді (кожен рядок в окремому рядку).
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Знайти суму всіх елементів
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сума елементів масиву " + sum);
    }
}
