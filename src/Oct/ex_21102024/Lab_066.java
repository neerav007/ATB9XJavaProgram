package Oct.ex_21102024;

public class Lab_066 {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        // Line No. | Exp  |  a
        //  5       |      |  10
        //  6       |  result = 10   |  11
        //  7       |  result = 10   |  11
    }
}
