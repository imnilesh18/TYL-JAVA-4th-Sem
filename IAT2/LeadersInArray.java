// Problem Statement: Given an array of integers, find and print all the leaders in the array.
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array from the user
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print the leaders in the array
        System.out.println("Leaders in the array are:");

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}

/*
Output:
6
16
17
3
4
5
2
Leaders in the array are:
17 5 2
*/
