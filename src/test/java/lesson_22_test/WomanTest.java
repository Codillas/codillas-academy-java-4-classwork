package lesson_22_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class WomanTest {

    private static Woman woman;

    @BeforeEach
    void SetUp() {
        woman = new Woman();
        woman.setName("Anna");

    }

    @Test
    void shouldBeHappy_ifMassageDateLessThan1Week_andBalance_isMoreThan100() {
        //given
        woman.setLastMassageDate(LocalDate.of(2026, 5, 7));
        woman.setPointsBalance(100);

        //when
        boolean happy = woman.isHappy();

        //then
        Assertions.assertTrue(happy);
    }

    @Test
    void shouldBeNotHappy_ifMassageDateMoreThan1Week_andBalance_isBelowThan100() {
        //given
        woman.setLastMassageDate(LocalDate.of(2026, 4, 7));
        woman.setPointsBalance(100);

        //when
        boolean happy = woman.isHappy();

        //then
        Assertions.assertFalse(happy);
    }

    @BeforeEach
    void setUp() {
        woman.setName("Kateryna");
    }

    @Test
    void shouldBeHappy_ifMassageDateMoreThan1Week_andBalance_isMoreThan100() {
        //given
        woman.setLastMassageDate(LocalDate.of(2026, 5, 7));
        woman.setPointsBalance(150);

        //when
        boolean happy = woman.isHappy();

        //then
        Assertions.assertFalse(happy);
    }

    @Test
    void shouldBeHappy_ifMassageDateMoreThan1Week_andBalance_isBelowThan100() {
        //given
        woman.setLastMassageDate(LocalDate.of(2026, 4, 7));
        woman.setPointsBalance(99);

        //when
        boolean happy = woman.isHappy();

        //then
        Assertions.assertFalse(happy);
    }
}