import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceGivenCharWithGivenCharTest {

    private ReplaceGivenCharWithGivenChar rep = new ReplaceGivenCharWithGivenChar();

    @Test
    void test() {
        assertEquals("osman", rep.replace("osman", ' ', 'X'));
        assertEquals("osmanXnaber", rep.replace("osman naber", ' ', 'X'));
        assertEquals("osmanXnaberXosiXosiX", rep.replace("osman naber osi osi ", ' ', 'X'));
    }
}