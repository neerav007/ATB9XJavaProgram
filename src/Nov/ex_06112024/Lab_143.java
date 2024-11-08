package Nov.ex_06112024;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Lab_143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car2 t1 = new Car2("Tesla", 2019);
        System.out.println("t1.Model");
        System.out.println("t1.Year");

        t1.display();

        Car2 t2 = new Car2("Nano", 2013);
        System.out.println("t2.Model");
        System.out.println("t2.Year");

        t2.display();

        System.out.println("Enter the model name");
        String input_model_name = sc.next();
        System.out.println("Enter the year");
        int year_input = sc.nextInt();
        Car2 t3 = new Car2(input_model_name, year_input);
        System.out.println(t3.model);
        System.out.println(t3.year);

        t3.display();


    }
}
class Car2 {
    String model;
    int year;



    // Parameterized constructor
    Car2(String model_name, int year_created) {
        System.out.println("PC");
        this.model = model_name;
        this.year = year_created;
    }

    void display() {
        System.out.println("Car2 Details -> " + this.model + " - "+ this.year);
    }


}
