package Oct.ex_25102024;

public class Lab_120 {
    public static void main(String[] args) {
        String name = "rohit";
        name = "sahu";
        name = "rohitsahu";
        name = "rohit"; // SCP

        // String -> data type
        // name -> Ref
        // = -> assignment operator
        // "Rohit" - Literal(String)

        System.out.println(name);



        String name2 = new String("Rohit");
        String name3 = new String("Rohit");
        String name5 = name2;
    }
}
