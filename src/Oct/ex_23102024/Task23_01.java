package Oct.ex_23102024;
import java.util.Scanner;
public class Task23_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int result = addition_of_two_numbers(a, b);
        System.out.println("Addition: " + result);

        int result1 = subtraction_of_two_numbers(a, b);
        System.out.println("Subtraction: " + result1);

        int result2 = multiplication_of_two_numbers(a, b);
        System.out.println("Multiplication: " + result2);

        int result3= division_of_two_numbers(a, b);
        System.out.println("Division: " + result3);

    }
    static int addition_of_two_numbers(int a,int b) {
        return a + b;
    }
        static int subtraction_of_two_numbers(int a,int b) {
            return a - b;
        }
            static int multiplication_of_two_numbers(int a,int b){
                return a*b;
    }
                static int division_of_two_numbers(int a,int b) {
                    return a / b;
                }
}
