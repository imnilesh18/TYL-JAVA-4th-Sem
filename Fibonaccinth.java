//Fibonnaci series for nth term
public class Fibonaccinth {
    public static int findNthFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        int prev = 0;
        int curr = 1;
        int next;

        for (int i = 3; i <= n; i++) {
            next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }

    public static void main(String[] args) {
        int n = 1; // Change this value to get the desired nth Fibonacci number
        int result = findNthFibonacci(n);
        System.out.println("The " + n + "th number in the Fibonacci series is: " + result);
    }
}
