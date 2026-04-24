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


        int[] numbers = {10, 20, 30, 40, 50};

        // classic for loop + break
        System.out.println("Classic for loop + break");
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 30){
                break;
            }
            System.out.println(numbers[i]);
        }

        // for each + break
        System.out.println("For each + break");
        for (int n : numbers) {
            if (n == 30) {
                break;
            }
            System.out.println(n);
        }

        // for each + continue
        System.out.println("Fore each + continue");
        for (int n : numbers) {
            if (n == 30) {
                continue;
            }
            System.out.println(n);
        }

    }
}
