package lesson_13_scanner;

import java.util.Scanner;

public class Main {

    void main() {
        // комбінація клавіш для імпорту
        // клікнути на клас і нажати option + Enter
        Scanner scanner = new Scanner(System.in);

        // Аналіз одновимірного масиву
        // З клавіатури зчитати розмір масиву.
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        System.out.println("Ви ввели число " + size);

        // Створити масив цілих чисел розміром.
        int [] arr = new int[size];

        // Виводимо пустий масив в консоль
        System.out.println("Масив має вигляд: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // За допомогою циклу зчитати з клавіатури кожен елемент масиву.
        for (int i = 0; i < arr.length; i++){
            System.out.println("Введіть елемент масиву на позиції " + i);
            arr[i] = scanner.nextInt();
        }

        // Виводимо введений масив в консоль
        System.out.println("Масив має вигляд: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Вивести:
        // Суму всіх елементів масиву.
        int sum = 0;
        for (int a: arr){
            sum = sum + a;
        }
        System.out.println("Сума елементів у масиві: " + sum);

        // Середнє арифметичне значення елементів.
        System.out.println("Середнє арифметичне значення: " + sum / arr.length);

        // Максимальне значення в масиві.
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Максимальне значення в масиві: " + max);

        // Мінімальне значення в масиві.
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Мінімальне значення в масиві: " + min);

        scanner.close();
    }
}
