package WithOutMain;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListReverserTest {

    @Test
    public void testReverseArrayList() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reversedList = ArrayListReverser.reverseArrayList(inputList);

        List<Integer> expectedList = Arrays.asList(5, 4, 3, 2, 1);

        assertEquals(expectedList, reversedList);
    }
}
