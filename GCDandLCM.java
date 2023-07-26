import java.util.Scanner;

public class GCDandLCM {

    // Function to find the GCD of two numbers using Euclid's algorithm
    public static int findGCD(int M, int N) {
        while (N != 0) {
            int R = M % N;
            M = N;
            N = R;
        }
        return M;
    }

    // Function to find the LCM of two numbers using Euclid's algorithm
    public static int findLCM(int M, int N) {
        int gcd = findGCD(M, N);
        return (M * N) / gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
