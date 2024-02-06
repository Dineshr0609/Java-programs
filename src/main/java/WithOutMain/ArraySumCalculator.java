package WithOutMain;
public class ArraySumCalculator {

    // Method to calculate the sum of all items in the array
    public static int calculateArraySum(int[] array) {
        int sum = 0;

        // Iterate over each element in the array and add it to the sum
        //for (elementType elementVariable : iterableObject)
        for (int item : array) {
            sum += item;
        }

        return sum;
    }
}
