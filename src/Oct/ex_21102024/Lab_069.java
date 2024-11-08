package Oct.ex_21102024;

public class Lab_069 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);
        // A  -> ++a -> 11 , a-> 11
        //  +
        // B- > ++a  -> 12, a -> 12
        // A+ B ->  11+12
    }
}
