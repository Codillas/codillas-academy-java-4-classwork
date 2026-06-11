package lesson_40_comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {

    BasketballPlayer Jordan = new BasketballPlayer("Michael", 97, 55);
    BasketballPlayer LeBron = new BasketballPlayer("James", 94, 68);
    BasketballPlayer Curry = new BasketballPlayer("Stephan", 98, 32);


    List<BasketballPlayer> players = new ArrayList<>();
    players.add(LeBron);
    players.add(Curry);
    players.add(Jordan);

    System.out.println(players);

   int result = Curry.compareTo(LeBron);
   System.out.println(result);

   players.sort(Collections.reverseOrder());
   System.out.println(players);

        System.out.println("-------------------------- \n Comarator \n -----------------");

   players.sort(new BasketballPlayerAgeComparator());
        System.out.println(players);

   Collections.sort(players, new BasketballPlayerScoreComparator());
        System.out.println(players);



    }
}