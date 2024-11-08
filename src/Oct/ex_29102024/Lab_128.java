package Oct.ex_29102024;

import java.util.Arrays;

public class Lab_128 {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length); // 1
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("- - - - - -");
        for (int i=0; i<marks.length;i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks); // {51,87,90,91,100};
        System.out.println("Sorted array");
        for (int i=0; i<marks.length;i++) {
            System.out.println(marks[i]);
        }

        int item_index = Arrays.binarySearch(marks, 100);
        System.out.println(item_index);
    }
}
