package WithOutMain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverser {

    public static List<Integer> reverseArrayList(List<Integer> inputList) {
        List<Integer> reversedList = new ArrayList<>(inputList);
        Collections.reverse(reversedList);
        return reversedList;
    }
}
