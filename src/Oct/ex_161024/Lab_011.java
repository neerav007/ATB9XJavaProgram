package Oct.ex_161024;
public class Lab_011 {
    public static void main(String[] args) {
        // Parse the command-line arguments as integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Calculate the maximum using a ternary operator
        int max = (num1 > num2) ? num1 : num2;

        // Print the result
        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + max);
    }
}
            //OUTPUT:-
    // The maximum between 50 and 60 is: 60




