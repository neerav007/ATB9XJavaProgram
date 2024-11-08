package Nov.ex_08112024.Methodoverloading;

public class Lab_149 {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        mathOperations.add(1,2,3);

    }
}

class MathOperations {

    // Method Overloading
    // Method will be Over load
    // Same name button different Argument or param

    void add() {
        System.out.println("With Zero Arguments");
    }

    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three integers: " + sum);
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, float f) {
        return a + b + f;
    }
}
