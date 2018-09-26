import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountACharacterTest {

    private CountACharacter countACharacter = new CountACharacter();


    @Test
    void shouldReturn_runTimeException_givenNullString() {
        assertThrows(RuntimeException.class, () -> countACharacter.count('a', null));
        assertThrows(RuntimeException.class, () -> countACharacter.count('a', ""));
    }

    @Test
    void test() {
        assertEquals(2, countACharacter.count('a', "java"));
        assertEquals(1, countACharacter.count('j', "java"));
        assertEquals(1, countACharacter.count('m', "osman"));
        assertEquals(4, countACharacter.count('i', "hello naber canim ay cok sikildim"));
    }
}