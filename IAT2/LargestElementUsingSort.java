// Problem Statement: Given an array of integers, find and print the largest element in the array.
import java.util.Arrays;
import java.util.Scanner;

public class LargestElementUsingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int n = sc.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Read the elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // The largest element is now at the end of the sorted array
        int largest = arr[n - 1];

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);

        sc.close();
    }
}

/*
Output:
5
Enter the elements of the array:
4
6
2
8
10
The largest element in the array is: 10
*/