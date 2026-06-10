package lesson_40_comparable_and_comparator;

import java.util.Comparator;

public class BasketballPlayerAgeComparator implements Comparator<BasketballPlayer> {

    @Override
    public int compare(BasketballPlayer first, BasketballPlayer second) {
        return first.getAge() - second.getAge();
    }
}
