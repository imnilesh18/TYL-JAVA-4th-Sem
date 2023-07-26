public class NeonNumber {

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        // Calculate the sum of digits of the square
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        // Check if the sum of digits is equal to the original number
        return sumOfDigits == number;
    }

    public static void main(String[] args) {
        int number = 9;
        if (isNeonNumber(number)) {
            System.out.println(number + " is a Neon number.");
        } else {
            System.out.println(number + " is not a Neon number.");
        }
    }
}
