package Strings;
import java.util.ArrayList;

public class TraversingElements {

    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        // Traversing using a for loop
        System.out.println("Traversing using a for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // Traversing using an enhanced for loop
        System.out.println("\nTraversing using an enhanced for loop:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
