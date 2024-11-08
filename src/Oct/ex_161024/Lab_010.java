package Oct.ex_161024;
import java.util.Scanner;
public class Lab_010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("Enter your salary: ");
            double salary = scanner.nextDouble();

            // Close the scanner
            scanner.close();
        }
    }
    // OUTPUT-
//    Enter your name: rohit sahu
//      Enter your age: 23
//       Enter your salary: 50,000




