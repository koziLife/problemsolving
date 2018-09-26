import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromTest {

    private CheckPalindrom pal = new CheckPalindrom();

    @Test
    void tests() {
        assertTrue(pal.checkPalindrom("madam"));
        assertFalse(pal.checkPalindrom("meryem"));
    }
}