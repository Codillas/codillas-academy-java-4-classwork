package lesson_16_classes;

import lesson_16_classes.animals.Cat;
import lesson_16_classes.food.Fish;

public class Main {
    static void main() {

        Cat loki = new Cat();
        loki.setName("Локі");
        loki.setAge(6);
        loki.setWeight(10.5);

        System.out.println("Котика звати: " +  loki.getName());
        System.out.println("Вік кота: " +  loki.getAge());
        System.out.println("Вага кота: " +  loki.getWeight());


        Cat vasya = new Cat("Вася", 12, 5.5);

        System.out.println("Котика звати: " +  vasya.getName());
        System.out.println("Вік кота: " +  vasya.getAge());
        System.out.println("Вага кота: " +  vasya.getWeight());

        System.out.println(vasya.toString());

        vasya.voice();

        vasya.voice("Покорми мене!");

        Fish fish = new Fish("Лосось");
        vasya.eat(fish);
    }
}
