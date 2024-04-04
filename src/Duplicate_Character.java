import java.util.Scanner;

public class Duplicate_Character {
    public static void main(String argu[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        scanner.close();

        char[] carray = str.toCharArray();
        System.out.println("The string is: " + str);
        System.out.print("Duplicate Characters in the above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
}
