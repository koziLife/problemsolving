import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfVowelsTest {

    private NumberOfVowels numberOfVowels = new NumberOfVowels();

    @Test
    void test() {
        assertTrue(numberOfVowels.findVowels("jjjj").isEmpty());
        assertEquals(1, numberOfVowels.findVowels("jjjja").get('a').intValue());
    }
}