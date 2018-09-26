package Fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveFibonacciTest {

    private RecursiveFibonacci recFib;

    @BeforeEach
    void setUp() {
        recFib = new RecursiveFibonacci();
    }

    @Test
    void shouldReturnMinusOne_whenGivenZero() {
        long result = recFib.calculateFib(-1);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnZero_whenGivenZero() {
       long result = recFib.calculateFib(0);

       assertEquals(0, result);
    }

    @Test
    void shouldReturnOne_whenGivenOne() {
        long result = recFib.calculateFib(1);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnOne_whenGivenTwo() {
        long result = recFib.calculateFib(1);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnTwo_whenGivenThree() {
        long result = recFib.calculateFib(2);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnSeven_whenGivenThirteen() {
        long result = recFib.calculateFib(7);

        assertEquals(13, result);
    }

}