import java.util.Arrays;

public class ArrayRemoveDuplicate {

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int uniqueElements = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Check if the current element is not equal to any previous elements
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, keep the element and move it to the leftmost position of unique elements
            if (!isDuplicate) {
                arr[uniqueElements] = arr[i];
                uniqueElements++;
            }
        }

        // Create a new array to store the unique elements
        int[] uniqueArray = Arrays.copyOf(arr, uniqueElements);
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 4, 9, 2};
        System.out.println("Original array:");
        printArray(arr);

        int[] uniqueArray = removeDuplicates(arr);
        System.out.println("\nArray after removing duplicates:");
        printArray(uniqueArray);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
