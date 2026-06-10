package lesson_40_comparable_and_comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasketballPlayer implements Comparable<BasketballPlayer> {

    private String name;
    private int score;
    private int age;


    @Override
    public int compareTo(BasketballPlayer otherPlayer) {

        if (this.score == otherPlayer.score) {
           return Integer.compare(this.age, otherPlayer.age);
        }  else if (this.score < otherPlayer.score) {
            return -1;
        }
        return 1;
    }
}

