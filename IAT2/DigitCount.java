// Problem Statement: Given an integer 'number' and a digit 'digitToCount', 
// write a program to count the occurrences of 'digitToCount' in 'number'.
import java.util.Scanner;

public class DigitCount {
    public static int countDigitOccurrences(int number, int digit) {
        int count = 0;
        while (number != 0) {
            int remainder = number % 10;
            if (remainder == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number from input
        int number = sc.nextInt();

        // Read the digit to count
        int digitToCount = sc.nextInt();

        // Calculate and print the count
        int occurrences = countDigitOccurrences(number, digitToCount);
        System.out.println(occurrences);

        // Close the scanner
        sc.close();
    }
}

/*
Output:
12221111
2
3
*/