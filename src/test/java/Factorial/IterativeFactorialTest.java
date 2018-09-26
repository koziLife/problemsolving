package Factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterativeFactorialTest {

    private IterativeFactorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new IterativeFactorial();
    }

    @Test
    void shouldReturnOne_whenGivenNumberZero() {
        long result = factorial.calculateFactorial(0);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnOne_whenGivenNumberOne() {
        long result = factorial.calculateFactorial(1);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnTwo_whenGivenNumberTwo() {
        long result = factorial.calculateFactorial(2);

        assertEquals(2, result);
    }
}