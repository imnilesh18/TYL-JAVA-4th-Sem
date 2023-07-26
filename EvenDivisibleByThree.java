public class EvenDivisibleByThree {

    public static int sumEvenDivisibleByThree(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i += 2) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // Replace '10' with your desired value of 'n'
        int sum = sumEvenDivisibleByThree(n);
        System.out.println("Sum of even numbers divisible by 3 from 0 to " + n + ": " + sum);
    }
}
