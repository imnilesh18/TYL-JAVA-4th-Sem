package qb1;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        char[] arr = new char[N];
        System.out.println("Enter " + N + " characters:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        String b = "" + arr[0]; // Initialize b with the first character

        for (int i = 1; i < N; i++) {
            if (arr[i] != arr[i - 1]) {
                b += arr[i];
            }
        }

        System.out.println(b);
    }
}

