import java.util.Arrays;

public class KthLargest {

    public static int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            System.out.println("Array has fewer than k elements.");
            return -1;
        }

        // Sort the array in descending order
        Arrays.sort(arr);

        // The kth largest element will be at index (k - 1)
        return arr[n - k];
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 12, 15};
        int k = 2; // Replace '2' with the desired value of k

        int kthLargest = findKthLargest(arr, k);

        if (kthLargest != -1) {
            System.out.println("The " + k + "th largest element is: " + kthLargest);
        }
    }
}
