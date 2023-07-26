//Write a Java Program to print all 3 digit even numbers from 1 to 300 that has 2 in its ten’s place.
public class EvenThreeDigit {

    public static void main(String[] args) {
        for (int num = 100; num <= 300; num ++) {
            // Check if the tens digit is 2 and the number is even
            if ((num / 10) % 10 == 2 && num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
