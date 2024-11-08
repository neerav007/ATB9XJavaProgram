package Oct.ex_22102024;
import java.util.Scanner;
public class Taskoct22_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check if it's a palindrome:");
        String original = sc.nextLine();   // Take input
        String reverse = "";               // Empty string to store the reverse

        // Reverse the string using a loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i); // Add each character from the end of original string
        }

        // Check if the original and reverse strings are the same
        if (original.equals(reverse)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

    }
}
