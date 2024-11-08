package Oct.ex_18102024;
import java.util.Scanner;
public class Lab_016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the conversion you want to perform:");
        System.out.println("1. Kilometers to Meters");
        System.out.println("2. Meters to Kilometers");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Fahrenheit to Celsius");
        int choice=sc.nextInt();
        double input, result;
        switch (choice) {
            case 1:
                System.out.println("Enter the value in kilometers: ");
                input = sc.nextDouble();
                result = input * 1000; // 1 kilometer = 1000 meters
                System.out.println(input + " kilometers is " + result + " meters.");
                break;
            case 2:
                System.out.println("Enter the value in meters: ");
                input = sc.nextDouble();
                result = input / 1000; // 1000 meters = 1 kilometers
                System.out.println(input + " meters is " + result + " kilometers.");
                break;
            case 3:
                System.out.println("Enter the temperature in Celsius: ");
                input = sc.nextDouble();
                result = (input * 9/5) + 32; // Celsius to Fahrenheit formula
                System.out.println(input + " Celsius is " + result + " Fahrenheit.");
                break;
            case 4:
                System.out.println("Enter the temperature in Fahrenheit: ");
                input = sc.nextDouble();
                result = (input - 32) * 5/9; // Fahrenheit to Celsius formula
                System.out.println(input + " Fahrenheit is " + result + " Celsius.");
                break;
            default:
                System.out.println("Invalid selection! Please choose a valid conversion option.");
                break;
        }
        sc.close();
    }
}
