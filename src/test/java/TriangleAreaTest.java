import lesson_7.TriangleArea;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleAreaTest {

    @Test
    void testValidArea() {
        assertEquals(TriangleArea.calculateArea(12, 15), 90.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void testZeroBaseShouldThrowException() {
        TriangleArea.calculateArea(0, 7);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void testNegativeHeightShouldThrowException() {
        TriangleArea.calculateArea(10, -5);
    }
}
