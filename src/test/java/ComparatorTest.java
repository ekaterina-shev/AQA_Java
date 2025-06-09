import lesson_7.Comparator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ComparatorTest {

    @Test
    public void testCompareEqual() {
        assertEquals(Comparator.compare(9, 9), 0);
    }

    @Test
    public void testFirstGreater() {
        assertEquals(Comparator.compare(10, 5), 1);
    }

    @Test
    public void testSecondGreater() {
        assertEquals( Comparator.compare(3, 8), -1);
    }
}
