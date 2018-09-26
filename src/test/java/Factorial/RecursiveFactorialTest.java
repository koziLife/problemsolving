package Factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveFactorialTest {

    private RecursiveFactorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new RecursiveFactorial();
    }

    @Test
    void shouldReturnOne_whenGivenReturnZero() {
        long result = factorial.calculateFactorial(0);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnOne_whenGivenReturnOne() {
        long result = factorial.calculateFactorial(1);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnTwo_whenGivenReturnTwo() {
        long result = factorial.calculateFactorial(2);

        assertEquals(2, result);
    }
}