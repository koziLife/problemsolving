package StringReverse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseIterationTest {

    private StringReverseIteration stringReverseIteration;

    @BeforeEach
    void setUp() {
        stringReverseIteration = new StringReverseIteration();
    }

    @Test
    void shouldReturn_a_whenGiven_a() {
        String strReverse = stringReverseIteration.reverse("a");

        assertEquals("a", strReverse);
    }

    @Test
    void shouldReturn_b_whenGiven_b() {
        String strReverse = stringReverseIteration.reverse("b");

        assertEquals("b", strReverse);
    }

    @Test
    void shouldReturn_ab_whenGiven_ba() {
        String strReverse = stringReverseIteration.reverse("ab");

        assertEquals("ba", strReverse);
    }

    @Test
    void shouldReturn_abcde_whenGiven_cdeba() {
        String strReverse = stringReverseIteration.reverse("abcde");

        assertEquals("edcba", strReverse);
    }
}