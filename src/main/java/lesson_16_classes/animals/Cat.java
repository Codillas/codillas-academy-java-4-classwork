package lesson_16_classes.animals;


import lesson_16_classes.food.Fish;
import lesson_16_classes.sound.Quack;

import java.util.Objects;

public class Cat extends Animal {

    // Додаємо поля

    private String name;
    private Breed breed;


    public Cat() {
        System.out.println("Викликаємо конструктор без параметрів");
    }

    public Cat(String name, int age, double weight, Breed breed) {
        System.out.println("Виклик констурктора з параметрами");

        this.name = name;
        this.breed = breed;
        super(weight, age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Breed getBreed() {
        return this.breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                " age=" + super.getAge() +
                " weight=" + super.getWeight() +
                " breed=" + breed +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Мяуууууу!");
    }

    public void voice(String word) {
        System.out.println("Мяууууууу! " + word);
    }

    public void purr() {
        System.out.println("Мурррррр!");
    }

    public Quack eat(Fish fish) {
        System.out.println("Дякую я поїв " + fish.getType());

        Quack quack = new Quack("Гучний квак");
        return quack;
    }

    // static method
    public static void defaultVoice() {
        System.out.println("Статичний мяяууу");
    }


    @Override
    public boolean equals(Object obj) {
       if (this == obj) {
           return true;
       }
       if (obj == null) {
           return false;
       }
       if (!(obj instanceof Cat)) {
           return false;
       }


       Cat otherCat = (Cat) obj;

       return this.name.equals(otherCat.name)
       && super.getAge() == otherCat.getAge()
       && super.getWeight() == otherCat.getWeight()
       && this.breed.equals(otherCat.breed);
    }

    @Override
    public int hashCode() {
        int age = super.getAge();
        int weight = (int)super.getWeight();
        int name = Objects.hash(this.name);
        int breed = Objects.hash(this.breed);

        return 31 * (age + weight + name + breed);
    }
}