package lesson_16_classes.util;

import lesson_16_classes.animals.Animal;
import lesson_16_classes.animals.Racoon;

public class GroomingSaloon {

    private String name;

    public GroomingSaloon(String name) {
        this.name = name;
    }

    public void groom(Animal animal) {
        if (animal instanceof Racoon) {
            System.out.println("Єнотів не стрижемо");
        } else {
            animal.voice();
            System.out.println("Дякую за стрижку!");
        }
    }
}
