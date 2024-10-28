package classwork_21.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTddTest {

    ArrayTdd arrayTdd;

    @BeforeEach
    void setUp() {
        int[] array ={10, 24, -34, 22, -15}; // 3 positive numbers
        arrayTdd = new ArrayTdd(array);
    }

    @Test
    void countPositiveNumbers() {
        int[] array ={10, 24, -34, 22, -15};
        // expected
        int expected = 3;

        // actual
        int actual = arrayTdd.countPositiveNumbers(array);

        assertEquals(expected,actual, "OK");

    }
}