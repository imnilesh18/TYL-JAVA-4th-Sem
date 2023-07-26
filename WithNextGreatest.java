public class WithNextGreatest {

    public static void replaceWithNextGreatest(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return;
        }

        int maxFromRight = arr[n - 1];
        arr[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxFromRight;
            maxFromRight = Math.max(maxFromRight, temp);
        }
    }

    public static void main(String[] args) {
        int[] arr = {17, 5, 9, 2, 12};
        System.out.println("Original array:");
        printArray(arr);

        replaceWithNextGreatest(arr);

        System.out.println("\nArray after replacement:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
