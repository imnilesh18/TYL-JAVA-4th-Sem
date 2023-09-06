/**
 * Problem Statement:
 * Count the number of vowels in the accepted string.
 */
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity
        sc.close();
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }

    // Function to check if a character is a vowel
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

/*
Output:
Enter a string: Hello World
Number of vowels: 3

Enter a string: This is a sample sentence.
Number of vowels: 8
*/
