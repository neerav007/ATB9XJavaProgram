package Oct.ex_15102024;

public class Lab_008 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // Part 1 ++a, Exp1 =11, a=11
        // Part 2 a++, Exp2 =11, a=12
        // Part 3 a++, Exp3 =12, a=13
        // By adding Exp1 + Exp2 + Exp3 i.e 11+11+12+34
    }
}
