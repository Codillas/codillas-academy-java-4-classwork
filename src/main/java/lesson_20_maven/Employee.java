package lesson_20_maven;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    // Створити клас Employee з полями name, salary, yearsOfExperience
    private String name;
    private double salary;
    private int yearsOfExperience;


    // Написати функцію isJunior()
    public boolean isJunior() {
        if (yearsOfExperience <= 2) {
            return true;
        } else {
            return false;
        }
    }

    // Написати функцію getBonus()
    public double getBonus() {

        return salary / 10;
    }
}

