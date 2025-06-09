import lesson_7.ArithmeticOperations;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArithmeticOperationsTest {

    @Test
    public void testSum() {
        assertEquals(ArithmeticOperations.sum(2, 7), 9);
    }

    @Test
    public void testSubtraction() {
        assertEquals(ArithmeticOperations.subtract(11, 5), 6);
    }

    @Test
    public void testMultiplication() {
        assertEquals(ArithmeticOperations.multiply(1, 8), 8);
    }

    @Test
    public void testDivision() {
        assertEquals(ArithmeticOperations.divide(14, 2), 7);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        ArithmeticOperations.divide(2, 0);
    }
}
