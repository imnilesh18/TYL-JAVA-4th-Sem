import java.util.Scanner;

public class TwinPrimes {
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

    public static void findTwinPrimes(int start, int end) {
        System.out.println("Twin prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Change the start and end values for your desired range
        System.out.println("Enter the Range");
        int start = sc.nextInt();
        int end = sc.nextInt();
        findTwinPrimes(start, end);
    }
}
