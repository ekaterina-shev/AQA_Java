import lesson_7.TriangleArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleAreaTest {

    @Test
    void testValidArea() {
        assertEquals(90.0, TriangleArea.calculateArea(12, 15));
    }

    @Test
    void testZeroBaseShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(0, 7));
    }

    @Test
    void testNegativeHeightShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(10, -5));
    }
}
