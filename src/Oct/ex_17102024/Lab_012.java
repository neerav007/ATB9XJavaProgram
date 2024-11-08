package Oct.ex_17102024;
import java.util.Scanner;
public class Lab_012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your percentage");
        int percentage=sc.nextInt();
        if(percentage<=100&& percentage>=90){
            System.out.println("Congratulation you have secured A grade");
        }
        else if (percentage<=89&& percentage>=80) {
            System.out.println("You have secured B grade");
        }
        else if (percentage<=79&& percentage>=70) {
            System.out.println("You have secured C grade");
        }
        else if (percentage<=69&& percentage>=60) {
            System.out.println("You have secured D grade");
        }
        else if (percentage<=59&& percentage>=33) {
            System.out.println("You have secured E grade");
        }
        else if(percentage<=32&& percentage>=0){
            System.out.println("You have secured F grade ");
        }
        else{
            System.out.println("Invalid Input: Please Enter Valid Percentage");
        }
        sc.close();
    }
}
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59