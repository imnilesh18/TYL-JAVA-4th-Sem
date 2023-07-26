import java.util.Scanner;

public class PrimeInRange {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void findPrimes(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Change the start and end values for your desired range
        System.out.println("Enter the Range");
        int start = sc.nextInt();
        int end = sc.nextInt();
        findPrimes(start, end);
    }
}
