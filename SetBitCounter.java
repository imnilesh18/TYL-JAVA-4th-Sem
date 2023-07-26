//Given a positive integer N, find the total count of set bits for all positive integers from (1 to N) (both inclusive)
// for -ve integer output should be zero

import java.util.Scanner;

public class SetBitCounter {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the N value: ");
        int N =sc.nextInt();
        if (N <= 0) {
            System.out.println("N should be a positive integer.");
            return;
        }

        int totalSetBits = 0;

        for (int i = 1; i <= N; i++) {
            totalSetBits += countSetBits(i);
        }

        System.out.println("Total count of set bits from 1 to " + N + ": " + totalSetBits);
    }

    public static int countSetBits(int num) {
        int count = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num >>= 1;
        }

        return count;
    }
}