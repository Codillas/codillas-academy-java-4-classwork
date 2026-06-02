package lesson_33_optional;

import java.util.Optional;

public class Main {

    static void main() {

        Forest forest = new Forest(3);

        Fox fox = new Fox();
        Wolf wolf = new Wolf();

        forest.addAnimalToForest(wolf);
        forest.addAnimalToForest(fox);

        Optional<Animal> optionalAnimal = forest.getFirstAnimal();
            if (optionalAnimal.isPresent()) {
                Animal firstAnimal = optionalAnimal.get();
                firstAnimal.voice();
            } else {
                System.out.println("Спочатку додай тварину в ліс, а потім клич її!!!");
            }

        Optional<Animal> optionalAnimal2 = forest.getAnimalByAge(5);
            if(optionalAnimal2.isPresent()) {
                Animal firstAnimal2 = optionalAnimal2.get();
                firstAnimal2.voice();
            } else {
                System.out.println("Такої старої тварини не існує");
            }
    }
}
