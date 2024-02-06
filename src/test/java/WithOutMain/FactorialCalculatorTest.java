package WithOutMain;
import org.junit.*;


import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorialWithZero() {
        long result = FactorialCalculator.calculateFactorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testCalculateFactorialWithPositiveNumber() {
        long result = FactorialCalculator.calculateFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testCalculateFactorialWithOne() {
        long result = FactorialCalculator.calculateFactorial(9);
        assertEquals(362880, result);
    }

    @Test
    public void testCalculateFactorialWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.calculateFactorial(-3);
        });
    }
}
