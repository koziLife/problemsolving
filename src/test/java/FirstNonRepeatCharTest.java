import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatCharTest {

    private FirstNonRepeatChar repeatChar;

    @BeforeEach
    void setUp() {
        repeatChar = new FirstNonRepeatChar();
    }

    @Test
    void shouldReturn_s_whenGiven_s() {
        char c = repeatChar.giveRepeatChar("s");

        assertEquals('s', c);
    }

    @Test
    void shouldReturn_is_whenGiven_empty() {
        char c = repeatChar.giveRepeatChar("isi");

        assertEquals('s', c);
    }

    @Test
    void shouldReturn_aaa_whenGiven_runTimeException() {
        assertThrows(RuntimeException.class, () -> repeatChar.giveRepeatChar("aaa"), "There is no repeat char");
    }
}