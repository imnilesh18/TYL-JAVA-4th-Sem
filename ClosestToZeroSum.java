import java.util.Arrays;

public class ClosestToZeroSum {

    public static void findClosestToZeroSum(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("At least two elements are required in the array.");
            return;
        }

        Arrays.sort(arr);

        int minSum = Integer.MAX_VALUE;
//        System.out.println(minSum);
        int num1 = 0, num2 = 0;

        for (int i = 0, j = n - 1; i < j;) {
            int currentSum = arr[i] + arr[j];
//            System.out.println(currentSum);
//            System.out.println(minSum);
//            System.out.println(Math.abs(currentSum));
//            System.out.println(Math.abs(minSum));
            if (Math.abs(currentSum) < Math.abs(minSum)) {
                minSum = currentSum;
//                System.out.println("is inside "+minSum);
                num1 = arr[i];
                num2 = arr[j];
            }

            if (currentSum < 0) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println("Two elements whose sum is minimum are " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        int[] arr = {10, -5, 3, -4, -2, 7, -8};
        findClosestToZeroSum(arr);
    }
}
