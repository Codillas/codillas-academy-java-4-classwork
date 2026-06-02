package lesson_33_optional;

import java.util.Optional;

public class Forest {

    private Animal[] animals;
    public int animalCount = 0;

    public Forest(int animalAmount) {
        this.animals = new Animal[animalAmount];
    }

    public boolean isFull() {
        return this.animalCount == this.animals.length;
    }

    public void addAnimalToForest(Animal animal) {
        if (isFull()) {
            throw new ForestIsFullException();
        } else {
            animals[animalCount++] = animal;
        }
    }

    public Optional<Animal> getFirstAnimal() {
        return Optional.ofNullable(this.animals[0]);
    }


    // Тут є перевірка на null, тому що в масиві 3 ячейки а тварини тільки 2)
    public Optional<Animal> getAnimalByAge(int age) {
        for (Animal animal : animals) {
            if (animal != null && animal.getAge() == age) {
                return Optional.of(animal);
            }
        }
        return Optional.empty();
    }

}
