package Oct.ex_15102024;

public class Lab_007 {
         public static void main(String[] args) {
            int a = 10, b = 20, c = 15;

            // Using ternary operator to find the largest number
            int result = (a > b) ? a:(b > c) ? b:c;
            System.out.println("The largest number is: " + result);
        }
    }



