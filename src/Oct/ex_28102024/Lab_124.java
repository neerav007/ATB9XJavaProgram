package Oct.ex_28102024;

public class Lab_124 {
    public static void main(String[] args) {
        // STRING BUFFER &&  STRING BUILDER
        StringBuffer stringBuffer = new StringBuffer("Rohit");
        stringBuffer.append("Sahu");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Rohit");
        stringBuilder.append("Choudhury");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!"); // Modifies sb to "Hello World!"
        System.out.println(sb.toString()); // Output: Hello World!

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
