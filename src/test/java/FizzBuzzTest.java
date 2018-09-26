import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void shouldReturn_fizz_whenGiven_3() {
        String str = fizzBuzz.calculate(3);

        assertEquals("fizz", str);
    }

    @Test
    void shouldReturn_buzz_whenGiven_5() {
        String str = fizzBuzz.calculate(5);

        assertEquals("buzz", str);
    }

    @Test
    void shouldReturn_7_whenGiven_7() {
        String str = fizzBuzz.calculate(7);

        assertEquals("7", str);
    }

    @Test
    void shouldReturn_fizzbuzz_whenGiven_15() {
        String str = fizzBuzz.calculate(15);

        assertEquals("fizzbuzz", str);
    }
}