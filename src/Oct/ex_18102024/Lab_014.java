package Oct.ex_18102024;
import java.util.Scanner;
public class Lab_014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1=sc.nextDouble();
        System.out.println("Enter the second number");
        double num2=sc.nextDouble();
        System.out.println("Select the operation");
        System.out.println("1.  Addition(+)");
        System.out.println("2.  Subtraction(-)");
        System.out.println("3.  Multiplication(*)");
        System.out.println("4.  Division(/)");
        System.out.println("5.  Modulus(%)");
        int choice=sc.nextInt();
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                result = num1 % num2;
                System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
sc.close();
    }

    }

