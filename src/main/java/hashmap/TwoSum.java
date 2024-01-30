package hashmap;
import java.util.HashMap;

public class TwoSum {

    public static int[] findTwoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }

            numMap.put(nums[i], i);
        }

        // If no solution is found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] inputArray = {10, 20, 30, 40, 50, 60};
        int targetSum = 10;

        int[] result = findTwoSumIndices(inputArray, targetSum);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
