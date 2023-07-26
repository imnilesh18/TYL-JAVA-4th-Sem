package qb1;

import java.util.Scanner;

public class Seven {

    public static int findSecondLargest(int[] arr) {
        int n = arr.length;

        // Perform bubble sort in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // The second largest number will be at index n-2 after sorting
        return arr[n - 2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest number: " + secondLargest);
    }
}
