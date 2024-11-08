package Nov.ex_07112024.Single_Inheritence.Example_1;
// SINGLE INHERITENCE
public class Lab_145 {
    public static void main(String[] args) {
// SON WILL GET THE ATTRIBUTES FROM FATHER
        // 1 SON AND 1 FATHER
        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.BHK_2();  // SON HAS EXTENDED
        s1.BHK_3();

        Father f1 = new Father();
       // f1.BHK_3(); Father cannot inherit sons
    }
}
