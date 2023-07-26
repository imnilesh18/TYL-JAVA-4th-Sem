//WAP to check whether the given number belongs to the Fibonacci series or not
import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isFibonacciNumber(number)) {
            System.out.println(number + " is a Fibonacci number.");
        } else {
            System.out.println(number + " is not a Fibonacci number.");
        }
    }

    public static boolean isFibonacciNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        if (number == 0) {
            return true;
        }

        if ( number == 1) {
            return true;
        }
        int prev = 0;
        int curr = 1;
        int next;
        while (curr < number) {
            next = curr + prev;
            prev = curr;
            curr = next;
        }

        return curr == number;
    }
}