package WithOutMain;
import org.junit.Assert;
import org.junit.Test;


public class SwapIntegersTest {
    @Test
    public void testSwapIntegers() {
        int a = 5;
        int b = 10;

        // Creating an instance of SwapIntegers class
        SwapIntegers swapIntegers = new SwapIntegers();

        // Calling the swapIntegers method to swap values
        int[] arrays = swapIntegers.swapIntegers(a, b);

        // Verifying that the values are swapped
        Assert.assertEquals("Value of a should be 10", 10, arrays[0]);
        Assert.assertEquals("Value of b should be 5", 5, arrays[1]);
    }
}
