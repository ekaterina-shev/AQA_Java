import lesson_7.FactorialCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialPositive() {
        assertEquals(FactorialCalculator.factorial(2), 2);
    }

    @Test
    public void testFactorialZero() {
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        FactorialCalculator.factorial(-1);
    }
}
