package lesson_33_optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private String name;
    private int age;

    public void voice() {
        System.out.println("Голос тварини");
    }
}
