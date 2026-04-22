package lesson_11_switch_case;

public class Main {
    public static void main() {

        /*
        char grade = 'X';

        switch(grade) {
            case 'A' :
                System.out.println("Відмінно!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Добре (B або C)"); // Runs IF ([case B] OR [case C])
                break;
            case 'D' :
                System.out.println("Зараховано");
            case 'F' :
                System.out.println("Спробуй ще"); // Runs IF ([case D] OR [case F])
                break;
            default :
                System.out.println("Неправильна оцінка");
        }

        System.out.println("Кінець виконання програми");
         */

        // Написати програму, що залежно від числа (1-7) виводить у консоль день тижня українською мовою.

        int dayOfTheWeek = 2;

        String ukrainianDayName;

        switch (dayOfTheWeek) {
            case 1:
                ukrainianDayName = "Понеділок";
                break;
            case 2:
                ukrainianDayName = "Вівторок";
                break;
            case 3:
                ukrainianDayName = "Середа";
                break;
            case 4:
                ukrainianDayName = "Четвер";
                break;
            case 5:
                ukrainianDayName = "П'ятниця";
                break;
            case 6:
                ukrainianDayName = "Субота";
                break;
            case 7:
                ukrainianDayName = "Неділя";
                break;
            default:
                ukrainianDayName = "ШО ЗА БРЕД?";
        }

        System.out.println(ukrainianDayName);
    }
}
