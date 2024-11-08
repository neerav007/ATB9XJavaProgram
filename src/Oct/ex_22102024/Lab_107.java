package Oct.ex_22102024;
import java.util.Scanner;//
public class Lab_107 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        while (age > 0) {
            System.out.println(age);
            age--;
        }*/
        // Two Ways
        // 1 Arguments
        // 2. Scanner Class
        // 3. BufferReader - R

        // Take a User input for the age and print the output.
        // 30 , 30, 29, 28.....1

        String arg_age_string = args[0];
        // String -> Int
        int age = Integer.parseInt(arg_age_string);
        //System.out.println(age);

        while (age > 0) {
            System.out.println(age);
            age--;
        }

    }
}
