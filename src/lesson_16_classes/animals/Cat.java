package lesson_16_classes.animals;

public class Cat {

    // Додаємо поля

    private String name;
    private int age;
    private double weight;


    public Cat() {
        System.out.println("Викликаємо конструктор без параметрів");
    }

    public Cat(String name, int age, double weight) {
        System.out.println("Виклик констурктора з параметрами");

        this.name = name;
        this.age = age;
        this.weight = weight;
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

}