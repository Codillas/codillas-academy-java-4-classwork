package lesson_40_comparable_and_comparator;

import java.util.Comparator;

public class BasketballPlayerScoreComparator implements Comparator<BasketballPlayer> {

    @Override
    public int compare(BasketballPlayer first, BasketballPlayer second) {
        return first.getScore() - second.getScore();
    }
}
