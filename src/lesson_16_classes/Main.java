package lesson_16_classes;

import lesson_16_classes.animals.Breed;
import lesson_16_classes.animals.Cat;
import lesson_16_classes.food.Fish;
import lesson_16_classes.sound.Quack;

public class Main {
    static void main() {

        Cat loki = new Cat();
        loki.setName("Локі");
        loki.setAge(6);
        loki.setWeight(10.5);
        loki.setBreed(Breed.valueOf("BOMBAY"));

        System.out.println("Котика звати: " +  loki.getName());
        System.out.println("Вік кота: " +  loki.getAge());
        System.out.println("Вага кота: " +  loki.getWeight());
        System.out.println("Порода кота: " +  loki.getBreed());



        Cat vasya = new Cat("Вася", 12, 5.5, Breed.SPHINX);

        System.out.println("Котика звати: " +  vasya.getName());
        System.out.println("Вік кота: " +  vasya.getAge());
        System.out.println("Вага кота: " +  vasya.getWeight());
        System.out.println("Порода кота: " +  vasya.getBreed());

        Breed breed = vasya.getBreed();
        String breedString = breed.name();

        System.out.println(vasya.toString());

        vasya.voice();

        vasya.voice("Покорми мене!");

        Fish fish = new Fish("Лосось");

        Quack quack = vasya.eat(fish);
        System.out.println(quack.getType());


        // static method

        Cat.defaultVoice();

        // switch example

        Breed lokiBreed = loki.getBreed();
        switch (lokiBreed) {
            case SPHINX  -> System.out.println("Сфінкс");
            case MAIN_KUN -> System.out.println("Мейн Кун");
            case BOMBAY -> System.out.println("програма зупиниться тут, тому що локі за параметрами Бомбей");
            default -> System.out.println("Локі, ти звичайний німецький дворовий кіт!");
        }
    }
}
