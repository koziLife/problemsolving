import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharsInStringTest {

    private DuplicateCharsInString dup;

    @Test
    void tests() {
        dup = new DuplicateCharsInString();

        assertTrue(dup.getDuplicateChars("a").isEmpty());
        assertEquals(1, dup.getDuplicateChars("aa").size());
        assertEquals(3, dup.getDuplicateChars("asdsaa").get('a').intValue());
    }
}