// Problem Statement: Given a positive integer 'n', write a program to find the nth term of the Fibonacci series.
import java.util.Scanner;

public class FibonacciSeries {
    public static int findNthFibonacciTerm(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int prev = 0, current = 1;
            int next;
            for (int i = 3; i <= n; i++) {
                next = prev + current;
                prev = current;
                current = next;
            }
            return current;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the value of 'n' from input
        int n = sc.nextInt();

        // Find and print the nth Fibonacci term
        int nthTerm = findNthFibonacciTerm(n);
        System.out.println(nthTerm);

        // Close the scanner
        sc.close();
    }
}

/*
Output:
5
3
*/