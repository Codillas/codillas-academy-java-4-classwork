package lesson_41_stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    static void main() {

        List<Cat> catList = new ArrayList<>();

        Cat Murka = new Cat("Murka", 1, 4.45);
        Cat Petya = new Cat("Petya", 7, 8.1);
        Cat Barsik = new Cat("Barsik", 12, 6.67);
        Cat Murzik = new Cat("Murzik", 3, 10.5);
        Cat Lili = new Cat("Lili", 5, 5.1);

        catList.addAll(List.of(Murka, Petya, Barsik, Murzik, Lili));

        //    Знайти всіх котів старших за (>= 5) років.
        List<Cat> catsOlder5yo = catList.stream()
                .filter(cat -> cat.age() >= 5)
                .collect(Collectors.toList());

        //    Підрахувати кількість котів, вага яких більша за (>4) кг.
        long numberOfCatsHeavierThan4kg = catList.stream()
                .filter(cat -> cat.weight() > 4)
                .count();

        //    Знайти найважчого кота
        Optional<Cat> heaviestCat = catList.stream()
                .max(Comparator.comparingDouble(Cat::weight));

        //    Створити список імен котів, відсортованих за віком у зростаючому порядку.
        List<String> catNames = catList.stream()
                .sorted((cat1, cat2) -> Integer.compare(cat1.age(), cat2.age()))
                .map(cat -> cat.name())
                .collect(Collectors.toList());

        //    Перевірити, чи є хоча б один кіт молодший за 1 рік.
        boolean anyCatYoungerThan1Year = catList.stream()
                .anyMatch(cat -> cat.age() < 1);

        //    Порахувати вагу всіх котів.
        double sumOfCatsWeights = catList.stream()
                .map(cat -> cat.weight())
                .reduce(0.0, Double::sum);

        double sumOfCatsWeights2 = 0;
        for (Cat cat : catList) {
            sumOfCatsWeights2 += cat.weight();
        }

        System.out.println(catsOlder5yo);
        System.out.println(numberOfCatsHeavierThan4kg);
        System.out.println(heaviestCat);
        System.out.println(catNames);
        System.out.println(anyCatYoungerThan1Year);
        System.out.println(sumOfCatsWeights);
        System.out.println(sumOfCatsWeights2);
    }
}
