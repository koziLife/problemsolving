package Factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TailFactorialTest {

    private TailFactorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new TailFactorial();
    }

    @Test
    void shouldReturnOne_whenGivenReturnZero() {
        long result = factorial.calculateFactorial(0, 1);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnOne_whenGivenReturnOne() {
        long result = factorial.calculateFactorial(1, 1);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnTwo_whenGivenReturnTwo() {
        long result = factorial.calculateFactorial(2, 1);

        assertEquals(2, result);
    }

    @Test
    void shouldReturnSix_whenGivenReturnThree() {
        long result = factorial.calculateFactorial(3, 1);

        assertEquals(6, result);
    }

}