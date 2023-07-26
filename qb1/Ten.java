package qb1;

import java.util.Arrays;
import java.util.Scanner;

public class Ten {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        int[] A = new int[N];
        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Find the minimum and maximum elements using built-in functions
        int min = Arrays.stream(A).min().getAsInt();
        int max = Arrays.stream(A).max().getAsInt();

        // Calculate the sum of the minimum and maximum elements
        int sumMinMax = min + max;

        System.out.println("Sum of minimum and maximum elements: " + sumMinMax);
    }
}
