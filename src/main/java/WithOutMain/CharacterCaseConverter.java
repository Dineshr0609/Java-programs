package WithOutMain;
public class CharacterCaseConverter {

    // Method to replace lower-case characters with upper-case and vice-versa
    public static String convertCase(String input) {
        char[] charArray = input.toCharArray();

        // Iterate over each character and perform the case conversion
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if (Character.isLowerCase(currentChar)) {
                charArray[i] = Character.toUpperCase(currentChar);
            } else if (Character.isUpperCase(currentChar)) {
                charArray[i] = Character.toLowerCase(currentChar);
            }
        }

        return new String(charArray);
    }
}
