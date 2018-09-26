package Fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TailRecursiveFibonacciTest {

    private TailRecursiveFibonacci tail;

    @BeforeEach
    void setUp() {
        tail = new TailRecursiveFibonacci();
    }

    @Test
    void shouldReturnZero_whenGivenZero() {
        long result = tail.calculateFib(0, 0, 1);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnOne_whenGivenOne() {
        long result = tail.calculateFib(1, 0, 1);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnOne_whenGivenTwo() {
        long result = tail.calculateFib(2, 0, 1);

        assertEquals(1, result);
    }
}