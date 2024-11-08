package Oct.ex_21102024;

public class Lab_043 {
    public static void main(String[] args) {
        String first_name = "Rohit";
        String last_name = "Sahu";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // RohitSahu1010 - first operator - + performed as Concatination
        System.out.println(a + b + first_name + last_name);
        // First + math -> 20RohitSahu

        System.out.println(first_name + last_name + (a + b));
        // BODMAS -
    }
}
