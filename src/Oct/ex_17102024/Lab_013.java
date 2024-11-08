package Oct.ex_17102024;
import java.util.Scanner;
public class Lab_013 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int s1=sc.nextInt();
            System.out.println("Please Enter the first side of triangle");
            int s2=sc.nextInt();
            System.out.println("Please Enter the second side of triangle");
            int s3=sc.nextInt();
            System.out.println("Please Enter the third side of triangle");
            if(s1==s2 && s2==s3){
                System.out.println("The triangle is Equilateral Triangle ");
            }
            else if (s1==s2 && s1!=s3 ||
                    s1==s3 && s1!=s2||
                    s2==s3 && s2!=s1) {
                System.out.println("The triangle is Isosceles Triangle");
            }
            else if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
                System.out.println("Sides cannot be zero or negative:Please enter valid sides");
            }
            else {
                System.out.println("The triangle is Scalene Triangle ");
            }
            sc.close();
        }
    }


