package Nov.ex_07112024.Single_Inheritence.Example_2;

public class Python extends Programming{
    // Extend - Is a
    // Python - Is a
    void print() {
        System.out.println(version);
        System.out.println(author);
    }
    Python () {
        System.out.println("DC");
    }

    public static void main(String[] args) {
        Python p1 = new Python();
        System.out.println(p1.author);
    }
}
