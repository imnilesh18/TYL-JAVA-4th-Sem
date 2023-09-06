// Problem Statement: Given a positive integer 'limit', find and print all twin prime pairs up to the 'limit'.

import java.util.Scanner;

public class TwinPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the maximum limit from the user
        int limit = sc.nextInt();

        System.out.println("Twin Prime Pairs:");

        int prevPrime = 2; // Initialize with the first prime number

        for (int num = 3; num <= limit; num++) {
            if (isPrime(num)) {
                if (num - prevPrime == 2) {
                    System.out.println("(" + prevPrime + ", " + num + ")");
                }
                prevPrime = num;
            }
        }

        sc.close();
    }
}

/*
Output:
20
Twin Prime Pairs:
(3, 5)
(5, 7)
(11, 13)
(17, 19)
*/