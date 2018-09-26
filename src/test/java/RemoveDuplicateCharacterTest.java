import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateCharacterTest {

    private RemoveDuplicateCharacter removeDuplicateCharacter = new RemoveDuplicateCharacter();


    @Test
    void shouldReturn_a_whenGiven_a() {
        String str = removeDuplicateCharacter.remove("a");
        String expected = "a";

        assertEquals(expected, str);
    }

    @Test
    void shouldReturn_ab_whenGiven_ab() {
        String str = removeDuplicateCharacter.remove("ab");
        String expected = "ab";

        assertEquals(expected, str);
    }

    @Test
    void shouldReturn_aba_whenGiven_aba() {
        String str = removeDuplicateCharacter.remove("abaaaa");
        String expected = "ab";

        assertEquals(expected, str);
    }


}