package Strings;

public class VowelCounter {
    public static void main(String[] args) {
        String inputString = "My Name Is Dinesh RavipaTi";
        int result = countVowels(inputString);
        System.out.println("The number of vowels in the given string is: " + result);
    }

    public static int countVowels(String inputString) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (char character : inputString.toCharArray()) {
            if (vowels.indexOf(character) != -1) {
                count++;
            }
        }

        return count;
    }
}
