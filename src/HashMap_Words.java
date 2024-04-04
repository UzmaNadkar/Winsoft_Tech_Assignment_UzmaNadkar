// Java Program to find the occurrence
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        scanner.close();

        // Create a HashMap to store word counts
        Map<String, Integer> hashMap = new HashMap<>();

        // Split the input string into words
        String[] words = str.split(" ");

        // Iterate over each word
        for (String word : words) {
            // Asking whether the HashMap contains the key or not. Will return null if not.
            Integer count = hashMap.get(word);

            // If the word is not present in the HashMap, put it with count 1
            if (count == null)
                hashMap.put(word, 1);
            else {
                // If the word is already present in the HashMap, increment its count
                hashMap.put(word, count + 1);
            }
        }

        // Print the HashMap containing word counts
        System.out.println(hashMap);
    }
}
