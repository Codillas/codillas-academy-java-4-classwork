package lesson_12_loops;

public class Main {

    void main() {

        int x = 10;

        // while loop
        while (x > 5) {
            System.out.println("Значення x: " + x);

            x--;
        }

        // do while
        do {
            System.out.println("Значення x: " + x);
            x++;
        } while (x > 10);

        // for loop
        for (int i = 10; i <= 15; i++) {
            System.out.println("Значення i: " + i);
        }
    }
}
