package qb1;

public class Second {
        public static void main(String[] args) {
            int[] arr1 = {10, 20, 30, 40, 50};
            int[] arr2 = {0, 2};
            int sum = 0;

            // Calculate the sum of all elements in arr1
            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i];
            }

            // Subtract elements at indices specified by arr2 from the sum
            for (int i = 0; i < arr2.length; i++) {
                sum -= arr1[arr2[i]];
            }

            System.out.println(sum);
        }
}