/**
 * Problem Statement:
 * You are given an integer 'n' and 'n' strings. Sort the strings in both ascending and
 * descending order and print the sorted arrays.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of strings
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Initialize an array of strings
        String[] arr = new String[n];

        // Read the strings into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted in descending order:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}

/*
Output:
4
banana
apple
cherry
date
Sorted in ascending order:
apple
banana
cherry
date
Sorted in descending order:
date
cherry
banana
apple
*/

