package lesson_16_classes.animals;


import lesson_16_classes.food.Fish;
import lesson_16_classes.sound.Quack;

public class Cat {

    // Додаємо поля

    private String name;
    private int age;
    private double weight;
    private Breed breed;


    public Cat() {
        System.out.println("Викликаємо конструктор без параметрів");
    }

    public Cat(String name, int age, double weight,  Breed breed) {
        System.out.println("Виклик констурктора з параметрами");

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;


    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
                " age=" + age +
                " weight=" + weight +
                " breed=" + breed +
                '}';
    }


    // Що може робити кіт?
    // голос
    // голос + параметр
    // щось їсти

    public void voice() {
        System.out.println("Мяуууууу!");
    }

    public void voice(String word) {
        System.out.println("Мяууууууу! " + word);
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
}