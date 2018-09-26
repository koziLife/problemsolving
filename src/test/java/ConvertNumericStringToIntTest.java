import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertNumericStringToIntTest {

    private ConvertNumericStringToInt stringToInt = new ConvertNumericStringToInt();


    @Test
    void tests() {
        assertEquals(1, stringToInt.convert("1"));
        assertEquals(1432423, stringToInt.convert("1432423"));
        assertEquals(-1, stringToInt.convert("12ab"));
    }
}