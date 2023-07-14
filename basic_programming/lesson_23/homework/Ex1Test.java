package lesson_23.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex1Test {
    Ex1 ex1;
    @BeforeEach
    void setUp() {
        ex1 = new Ex1();
    }

    @Test
    void countPosNumTest() {
        int[] array = {1, 2, 3, -4, -5, 6, -7, 8, 9, -10};
        assertEquals(5, Ex1.countPosNum(array));
    }

    @Test
    void countNegNumTest() {
        int[] array = {1, 2, 3, -4, -5, 6, -7, 8, 9, -10};
        assertEquals(4, Ex1.countNegNum(array));
    }

    @Test
    void countEvenTest() {
        int[] array = {1, 2, 3, -4, -5, 6, -7, 8, 9, -10};
        int expected = 5;
        int actual = Ex1.countEven(array);
        assertEquals(expected, actual);
    }

    @Test
    void countZeroTest() {
        int[] array = {1, 2, 3, -4, -5, 6, -7, 8, 9, -10};
        assertEquals(0, Ex1.countZero(array));
    }
}