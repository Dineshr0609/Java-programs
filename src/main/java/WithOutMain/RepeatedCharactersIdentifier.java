package WithOutMain;
import java.util.HashSet;
import java.util.Set;

public class RepeatedCharactersIdentifier {

    // Method to identify and print repeated characters in a string
    public static void printRepeatedCharacters(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // If the character is already in uniqueChars, it is repeated
            if (!uniqueChars.add(c)) {
                repeatedChars.add(c);
            }
        }

        // Print repeated characters
        System.out.println("Repeated characters in the string:");
        for (char repeatedChar : repeatedChars) {
            System.out.println(repeatedChar + " - " + countOccurrences(input, repeatedChar) + " times");
        }
    }

    // Helper method to count occurrences of a specific character in the string
    private static int countOccurrences(String input, char targetChar) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }
        return count;
    }
}

