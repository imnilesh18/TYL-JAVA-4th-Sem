public class EvenDivisibleByThreeWithTwoOnTensDigit{

    public static int sumEvenDivisibleByThreeWithTwoOnTensDigit(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i += 2) {
            if (i % 3 == 0 && (i / 10) % 10 == 2) {
                sum += i;
                System.out.print(i + " ");
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 1000; // Replace '100' with your desired value of 'n'
        System.out.println("Numbers with 2 on ten's digit that are even and divisible by 3:");
        int sum = sumEvenDivisibleByThreeWithTwoOnTensDigit(n);
        System.out.println("\nSum of such numbers: " + sum);
    }
}
