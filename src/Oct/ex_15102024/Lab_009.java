package Oct.ex_15102024;

public class Lab_009 {
    public static void main(String[] args) {
        int a =20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
        // Part 1 --a, Exp1 =19, a=19
        // Part 2 a++, Exp2 =19, a=20
        // Part 3 a++, Exp3 =20, a=19
        // By adding Exp1 + Exp2 + Exp3 i.e 19+19+20+58
    }
}
