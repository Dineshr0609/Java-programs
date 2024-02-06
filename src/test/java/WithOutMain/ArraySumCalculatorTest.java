package WithOutMain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySumCalculatorTest {

    @Test
    public void testCalculateArraySumWithPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        int result = ArraySumCalculator.calculateArraySum(array);
        assertEquals(15, result);
    }

    @Test
    public void testCalculateArraySumWithNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        int result = ArraySumCalculator.calculateArraySum(array);
        assertEquals(-15, result);
    }

    @Test
    public void testCalculateArraySumWithEmptyArray() {
        int[] array = {};
        int result = ArraySumCalculator.calculateArraySum(array);
        assertEquals(0, result);
    }

    @Test
    public void testCalculateArraySumWithSingleElement() {
        int[] array = {7};
        int result = ArraySumCalculator.calculateArraySum(array);
        assertEquals(7, result);
    }
}
