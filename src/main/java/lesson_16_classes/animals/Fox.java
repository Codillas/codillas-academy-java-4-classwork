package lesson_16_classes.animals;

import lombok.Getter;


public class Fox extends Animal {

    private boolean rabies;

    public Fox() {
    };

    public Fox(double weight, int age, boolean isRabid) {
        super(weight, age);
    }

    private boolean isRabid() {
        return rabies;
    }

    @Override
    public void voice() {
        System.out.println("Я дивна лисичка, яка гавкає!");

        if (isRabid()) {
            System.out.println("Я скажена: гав гав");
        } else {
            System.out.println("Я нормальна лисичка: ричу, пищу");
        }
    }

    public void setRabid(boolean rabid) {
        rabies = rabid;
    }
}
