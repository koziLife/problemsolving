import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {

    private CamelCase camelCase = new CamelCase();

    @Test
    void tests() {
        assertEquals(3, camelCase.count("thisIsNice"));
    }
}