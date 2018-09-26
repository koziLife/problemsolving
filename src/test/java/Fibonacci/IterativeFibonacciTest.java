package Fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IterativeFibonacciTest {

    IterativeFibonacci iterativeFibonacci;


    @BeforeEach
    void setUp() {
        iterativeFibonacci = new IterativeFibonacci();
    }

    @Test
    void shouldReturnZero_whenGivenNumberZero() {
        long result = iterativeFibonacci.calculateFib(0);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnOne_whenGivenNumberOne() {
        long result = iterativeFibonacci.calculateFib(1);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnOne_whenGivenNumberTwo() {
        long result = iterativeFibonacci.calculateFib(2);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnTwo_whenGivenNumberThree() {
        long result = iterativeFibonacci.calculateFib(3);

        assertEquals(2, result);
    }

    @Test
    void shouldReturnSeven_whenGivenNumberThirteen() {
        long result = iterativeFibonacci.calculateFib(7);

        assertEquals(13, result);
    }
}