import lesson_7.ArithmeticOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperationsTest {

    @Test
    void testSum() {
        assertEquals(9, ArithmeticOperations.sum(2, 7));
    }

    @Test
    void testSubtraction() {
        assertEquals(6, ArithmeticOperations.subtract(11, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(8, ArithmeticOperations.multiply(1, 8));
    }

    @Test
    void testDivision() {
        assertEquals(7, ArithmeticOperations.divide(14, 2));
    }

    @Test
    void testDivisionByZeroShouldThrowException() {
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(2, 0));
    }
}
