package Oct.ex_29102024;

public class Task29_02 {
    public static boolean hasDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(hasDuplicates(numbers)); // Output: false

        int[] numbersWithDuplicates = {1, 2, 3, 4, 4};
        System.out.println(hasDuplicates(numbersWithDuplicates)); // Output: true

    }
}
