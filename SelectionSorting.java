public class SelectionSorting {
    public static void main(String[] arguments) {
        int[] arr = {32, 45, 6, 87, 12, 1};
        System.out.print("Original array : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nSorted array : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
}
