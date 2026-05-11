package lesson_20_maven;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void shouldBeJunior() {
        //given
        Employee employee = new Employee("Vasyl", 50000, 2);

        //when
        boolean result = employee.isJunior();

        //then
        Assertions.assertTrue(result);

    }

    @Test
    void shouldNotBeJunior() {
        //given
        Employee employee = new Employee("Vasyl", 50000, 3);

        //when
        boolean result = employee.isJunior();

        //then
        Assertions.assertFalse(result);

    }

    @Test
    void shouldRetrurnTenPercentBonus() {
        //given
        Employee employee = new Employee("Vasyl", 50000, 2);

        //when
        double bonus = employee.getBonus();

        //then
        Assertions.assertEquals(bonus, 5000.0);
    }

    @Test
    @DisplayName("Василь не отримує бонус, тому що він погано працював")
    void shouldNotRetrurnTenPercent()
    {
        //given
        Employee employee = new Employee("Vasyl", 0, 2);

        //when
        double bonus = employee.getBonus();

        //then
        Assertions.assertEquals(bonus, 0);
    }

}