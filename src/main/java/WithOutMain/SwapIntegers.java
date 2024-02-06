package WithOutMain;

public class SwapIntegers {

    // Method to swap two integers without using a third variable
    public static int[] swapIntegers(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Perform the swap without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
        return new int[]{a,b};
    }
}