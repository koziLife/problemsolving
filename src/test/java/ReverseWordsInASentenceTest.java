import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInASentenceTest {

    private ReverseWordsInASentence sentence = new ReverseWordsInASentence();

    @Test
    void tests() {
        assertEquals("hello", sentence.reverse("hello"));
        assertEquals("world hello", sentence.reverse("hello world"));
        assertEquals("ask meryem savas naber world hello", sentence.reverse("hello world naber savas meryem ask"));
    }
}