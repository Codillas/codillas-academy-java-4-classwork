package lesson_22_test;

import lombok.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
public class Woman {

    private String name;
    private LocalDate lastMassageDate;
    private double pointsBalance;

    public boolean isHappy() {
        // Якщо дата останнього масажу менше 1 тижня, то жінка щаслива -> true.

        LocalDate currentDate = LocalDate.now();
        long weeks = ChronoUnit.WEEKS.between(lastMassageDate, currentDate);

        if (weeks <= 1 && pointsBalance > 99) {
            return true;
        } else  {
            return false;
        }
    }
}
