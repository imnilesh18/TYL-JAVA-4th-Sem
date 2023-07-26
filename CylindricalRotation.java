//WAP to cylindrically rotate a given array clockwise by one
import java.util.Scanner;
public class CylindricalRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered the following array:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] rotatedArr = cylindricallyRotateArray(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] cylindricallyRotateArray(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return arr;
        }

        // Store the last element before rotation
        int temp = arr[n - 1];

        // Shift elements to the right by one position
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the beginning
        arr[0] = temp;

        return arr;
    }
}