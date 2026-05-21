package lesson_16_classes.animals;

public class Animal {


    private double weight;
    private int age;

    public Animal() {
    };

   public Animal(double weight, int age) {
       this.weight = weight;
       this.age = age;
   }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice() {
        System.out.println("Всі тварини кажуть так: ");
    }

}
