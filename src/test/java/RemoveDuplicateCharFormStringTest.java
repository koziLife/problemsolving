import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateCharFormStringTest {

    private RemoveDuplicateCharFormString str = new RemoveDuplicateCharFormString();

    @Test
    void tests() {
        assertEquals("a", str.remove("a"));
        assertEquals("a", str.remove("aa"));
        assertEquals("bans", str.remove("bananas"));
    }
}