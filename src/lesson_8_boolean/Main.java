package lesson_8_boolean;

public class Main {

    void main() {

        // ! - заперечення
        System.out.println("Оператор !");
        boolean a = true;
        System.out.println(a);
        boolean b = !a;
        System.out.println(b);

        // && - оператор "і"
        System.out.println("Оператор &&");
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true && false);

        // || - оператор "або"
        System.out.println("Оператор ||");
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(true || false);


        // Застосування
        System.out.println("Застосування заперечення");
        System.out.println(5 > 3); // true
        boolean resultOfDenial = !(5 > 3);
        System.out.println(resultOfDenial);

        System.out.println("Застосування оператора і");
        System.out.println(5 > 3 && 1 > 2); // false

        System.out.println("Застосування оператора або");
        System.out.println(5 > 3 || 1 > 2); // true




    }
}
