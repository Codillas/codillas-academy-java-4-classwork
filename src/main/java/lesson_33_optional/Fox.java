package lesson_33_optional;

public class Fox extends Animal {

    public Fox() {
        super("Сестричка", 5);
    }

    @Override
    public void voice() {
        System.out.println("тяф тяф тяф");
    }
}
