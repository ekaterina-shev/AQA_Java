import lesson_7.Comparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparatorTest {

    @Test
    void testComparatorEqualNumbers() {
        assertEquals(0, Comparator.compare(9, 9));
    }

    @Test
    void testComparatorFirstGreater() {
        assertEquals(1, Comparator.compare(10, 5));
    }

    @Test
    void testComparatorSecondGreater() {
        assertEquals(-1, Comparator.compare(3, 8));
    }
}
