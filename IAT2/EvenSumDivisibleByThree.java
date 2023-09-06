/*
 * Problem Statement:
 * Given a range of numbers, find the sum of even numbers that are divisible by 3.
 * Input: Two integers representing the start and end of the range.
 * Output: Print the sum of even numbers divisible by 3 within the specified range.
 */

import java.util.Scanner;

public class EvenSumDivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize variables
        int sum = 0;

        // Input range from the user
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        // Loop through the numbers in the range
        for (int number = start; number <= end; number++) {
            // Check if the number is both even and divisible by 3
            if (number % 2 == 0 && number % 3 == 0) {
                // Add the number to the sum
                sum += number;
            }
        }

        // Print the sum
        System.out.println("Sum of even numbers divisible by 3 is: " + sum);

        // Close the Scanner object
        sc.close();
    }
}

/*
Output:
Enter the start of the range: 1
Enter the end of the range: 10
Sum of even numbers divisible by 3 is: 6

Enter the start of the range: 1
Enter the end of the range: 20
Sum of even numbers divisible by 3 is: 36
*/
