package Oct.ex_22102024;
import java.util.Scanner;
public class Taskoct22_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to reverse:");
        int number = sc.nextInt();  // Input number
        int reversed = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;     // Get last digit
            reversed = reversed * 10 + digit;  // Append digit to reversed
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
