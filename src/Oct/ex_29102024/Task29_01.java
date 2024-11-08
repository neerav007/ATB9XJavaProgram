package Oct.ex_29102024;

public class Task29_01 {
    public static void main(String[] args) {

/**       ### 1. `Arrays.sort(array)`

        - **Purpose**: Sorts the elements of the array in ascending order.
                - **Usage**: `Arrays.sort(array);`
        - **How It Works**: For sorting, Java uses an efficient algorithm, typically a variant of TimSort for `int[]` or other primitive types, which combines the best features of merge sort and insertion sort.
        - **Example**:
 int[] numbers = {5, 1, 4, 3, 2};
        Arrays.sort(numbers);  // Now numbers = {1, 2, 3, 4, 5}
    ```

        - **Note**: `Arrays.sort()` modifies the original array, so it doesn’t create a new array but rather reorders the existing one.

         ### 2. `Arrays.binarySearch(array, key)`

        - **Purpose**: Searches for a specified `key` in a sorted array and returns the index of the key if found.
                - **Usage**: `int index = Arrays.binarySearch(array, key);`
        - **How It Works**: This method uses the binary search algorithm, which is efficient for finding elements in a sorted array. It splits the array in half repeatedly, comparing the middle element with the `key` until it finds a match or determines that the `key` is not present.
                - **Return Value**:
        - If the `key` is found, it returns the index of the key.
        - If the `key` is not found, it returns `-(insertion_point) - 1`, where `insertion_point` is where the `key` would be if it were added to the array.
        - **Example**:
         int[] sortedNumbers = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(sortedNumbers, 4);  // Returns 3, as 4 is at index 3
        int missingIndex = Arrays.binarySearch(sortedNumbers, 6);  // Returns -6, as 6 is not present
    ```

        - **Note**: `Arrays.binarySearch()` requires the array to be sorted in ascending order before searching. Otherwise, it may return incorrect results.
 **/
    }
}